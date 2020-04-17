package org.opencds.cqf.cql.execution;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.cqframework.cql.elm.execution.*;
import org.opencds.cqf.cql.elm.execution.ExpressionDef;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class JsonCqlLibraryReader {
    public static Library read(Reader reader) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JaxbAnnotationModule module = new JaxbAnnotationModule();
        mapper.registerModule(module);
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.setMixInAnnotation(Expression.class, org.opencds.cqf.cql.elm.execution.ExpressionMixin.class);
        simpleModule.registerSubtypes(
                org.opencds.cqf.cql.elm.execution.Abs.class,
                org.opencds.cqf.cql.elm.execution.Add.class,
                org.opencds.cqf.cql.elm.execution.After.class,
                org.opencds.cqf.cql.elm.execution.AliasRef.class,
                org.opencds.cqf.cql.elm.execution.AllTrue.class,
                org.opencds.cqf.cql.elm.execution.And.class,
                org.opencds.cqf.cql.elm.execution.AnyInValueSet.class,
                org.opencds.cqf.cql.elm.execution.AnyTrue.class,
                org.opencds.cqf.cql.elm.execution.As.class,
                org.opencds.cqf.cql.elm.execution.Avg.class,
                org.opencds.cqf.cql.elm.execution.Before.class,
                org.opencds.cqf.cql.elm.execution.CalculateAge.class,
                org.opencds.cqf.cql.elm.execution.CalculateAgeAt.class,
                org.opencds.cqf.cql.elm.execution.Case.class,
                org.opencds.cqf.cql.elm.execution.Ceiling.class,
                org.opencds.cqf.cql.elm.execution.Children.class,
                org.opencds.cqf.cql.elm.execution.Coalesce.class,
                org.opencds.cqf.cql.elm.execution.Code.class,
                org.opencds.cqf.cql.elm.execution.CodeDef.class,
                org.opencds.cqf.cql.elm.execution.CodeRef.class,
                org.opencds.cqf.cql.elm.execution.CodeSystemDef.class,
                org.opencds.cqf.cql.elm.execution.CodeSystemRef.class,
                org.opencds.cqf.cql.elm.execution.Collapse.class,
                org.opencds.cqf.cql.elm.execution.Combine.class,
                org.opencds.cqf.cql.elm.execution.Concatenate.class,
                org.opencds.cqf.cql.elm.execution.Concept.class,
                org.opencds.cqf.cql.elm.execution.Contains.class,
                org.opencds.cqf.cql.elm.execution.Convert.class,
                org.opencds.cqf.cql.elm.execution.Count.class,
                org.opencds.cqf.cql.elm.execution.Date.class,
                org.opencds.cqf.cql.elm.execution.DateFrom.class,
                org.opencds.cqf.cql.elm.execution.DateTime.class,
                org.opencds.cqf.cql.elm.execution.DateTimeComponentFrom.class,
                org.opencds.cqf.cql.elm.execution.Descendents.class,
                org.opencds.cqf.cql.elm.execution.DifferenceBetween.class,
                org.opencds.cqf.cql.elm.execution.Distinct.class,
                org.opencds.cqf.cql.elm.execution.Divide.class,
                org.opencds.cqf.cql.elm.execution.DurationBetween.class,
                org.opencds.cqf.cql.elm.execution.End.class,
                org.opencds.cqf.cql.elm.execution.Ends.class,
                org.opencds.cqf.cql.elm.execution.EndsWith.class,
                org.opencds.cqf.cql.elm.execution.Equal.class,
                org.opencds.cqf.cql.elm.execution.Equivalent.class,
                org.opencds.cqf.cql.elm.execution.Except.class,
                org.opencds.cqf.cql.elm.execution.Exists.class,
                org.opencds.cqf.cql.elm.execution.Exp.class,
                org.opencds.cqf.cql.elm.execution.Expand.class,
                org.opencds.cqf.cql.elm.execution.ExpressionRef.class,
                org.opencds.cqf.cql.elm.execution.Filter.class,
                org.opencds.cqf.cql.elm.execution.First.class,
                org.opencds.cqf.cql.elm.execution.Flatten.class,
                org.opencds.cqf.cql.elm.execution.Floor.class,
                org.opencds.cqf.cql.elm.execution.ForEach.class,
                org.opencds.cqf.cql.elm.execution.FunctionRef.class,
                org.opencds.cqf.cql.elm.execution.GeometricMean.class,
                org.opencds.cqf.cql.elm.execution.Greater.class,
                org.opencds.cqf.cql.elm.execution.GreaterOrEqual.class,
                org.opencds.cqf.cql.elm.execution.IdentifierRef.class,
                org.opencds.cqf.cql.elm.execution.If.class,
                org.opencds.cqf.cql.elm.execution.Implies.class,
                org.opencds.cqf.cql.elm.execution.In.class,
                org.opencds.cqf.cql.elm.execution.IncludedIn.class,
                org.opencds.cqf.cql.elm.execution.Includes.class,
                org.opencds.cqf.cql.elm.execution.InCodeSystem.class,
                org.opencds.cqf.cql.elm.execution.Indexer.class,
                org.opencds.cqf.cql.elm.execution.IndexOf.class,
                org.opencds.cqf.cql.elm.execution.Instance.class,
                org.opencds.cqf.cql.elm.execution.Intersect.class,
                org.opencds.cqf.cql.elm.execution.Interval.class,
                org.opencds.cqf.cql.elm.execution.InValueSet.class,
                org.opencds.cqf.cql.elm.execution.Is.class,
                org.opencds.cqf.cql.elm.execution.IsFalse.class,
                org.opencds.cqf.cql.elm.execution.IsNull.class,
                org.opencds.cqf.cql.elm.execution.IsTrue.class,
                org.opencds.cqf.cql.elm.execution.Last.class,
                org.opencds.cqf.cql.elm.execution.LastPositionOf.class,
                org.opencds.cqf.cql.elm.execution.Length.class,
                org.opencds.cqf.cql.elm.execution.Less.class,
                org.opencds.cqf.cql.elm.execution.LessOrEqual.class,
                org.opencds.cqf.cql.elm.execution.List.class,
                org.opencds.cqf.cql.elm.execution.Literal.class,
                org.opencds.cqf.cql.elm.execution.Ln.class,
                org.opencds.cqf.cql.elm.execution.Log.class,
                org.opencds.cqf.cql.elm.execution.Lower.class,
                org.opencds.cqf.cql.elm.execution.Matches.class,
                org.opencds.cqf.cql.elm.execution.Max.class,
                org.opencds.cqf.cql.elm.execution.MaxValue.class,
                org.opencds.cqf.cql.elm.execution.Median.class,
                org.opencds.cqf.cql.elm.execution.Meets.class,
                org.opencds.cqf.cql.elm.execution.MeetsAfter.class,
                org.opencds.cqf.cql.elm.execution.MeetsBefore.class,
                org.opencds.cqf.cql.elm.execution.Message.class,
                org.opencds.cqf.cql.elm.execution.Min.class,
                org.opencds.cqf.cql.elm.execution.MinValue.class,
                org.opencds.cqf.cql.elm.execution.Mode.class,
                org.opencds.cqf.cql.elm.execution.Modulo.class,
                org.opencds.cqf.cql.elm.execution.Multiply.class,
                org.opencds.cqf.cql.elm.execution.Negate.class,
                org.opencds.cqf.cql.elm.execution.Not.class,
                org.opencds.cqf.cql.elm.execution.NotEqual.class,
                org.opencds.cqf.cql.elm.execution.Null.class,
                org.opencds.cqf.cql.elm.execution.OperandRef.class,
                org.opencds.cqf.cql.elm.execution.Or.class,
                org.opencds.cqf.cql.elm.execution.Overlaps.class,
                org.opencds.cqf.cql.elm.execution.OverlapsAfter.class,
                org.opencds.cqf.cql.elm.execution.OverlapsBefore.class,
                org.opencds.cqf.cql.elm.execution.ParameterRef.class,
                org.opencds.cqf.cql.elm.execution.PointFrom.class,
                org.opencds.cqf.cql.elm.execution.PopulationStdDev.class,
                org.opencds.cqf.cql.elm.execution.PopulationVariance.class,
                org.opencds.cqf.cql.elm.execution.PositionOf.class,
                org.opencds.cqf.cql.elm.execution.Power.class,
                org.opencds.cqf.cql.elm.execution.Predecessor.class,
                org.opencds.cqf.cql.elm.execution.Product.class,
                org.opencds.cqf.cql.elm.execution.ProperContains.class,
                org.opencds.cqf.cql.elm.execution.ProperIn.class,
                org.opencds.cqf.cql.elm.execution.ProperlyIncludedIn.class,
                org.opencds.cqf.cql.elm.execution.ProperlyIncludes.class,
                org.opencds.cqf.cql.elm.execution.Property.class,
                org.opencds.cqf.cql.elm.execution.Quantity.class,
                org.opencds.cqf.cql.elm.execution.Query.class,
                org.opencds.cqf.cql.elm.execution.QueryLetRef.class,
                org.opencds.cqf.cql.elm.execution.Repeat.class,
                org.opencds.cqf.cql.elm.execution.ReplaceMatches.class,
                org.opencds.cqf.cql.elm.execution.Retrieve.class,
                org.opencds.cqf.cql.elm.execution.Round.class,
                org.opencds.cqf.cql.elm.execution.SameAs.class,
                org.opencds.cqf.cql.elm.execution.SameOrAfter.class,
                org.opencds.cqf.cql.elm.execution.SameOrBefore.class,
                org.opencds.cqf.cql.elm.execution.SingletonFrom.class,
                org.opencds.cqf.cql.elm.execution.Slice.class,
                org.opencds.cqf.cql.elm.execution.Split.class,
                org.opencds.cqf.cql.elm.execution.Start.class,
                org.opencds.cqf.cql.elm.execution.Starts.class,
                org.opencds.cqf.cql.elm.execution.StartsWith.class,
                org.opencds.cqf.cql.elm.execution.StdDev.class,
                org.opencds.cqf.cql.elm.execution.Substring.class,
                org.opencds.cqf.cql.elm.execution.Subtract.class,
                org.opencds.cqf.cql.elm.execution.Successor.class,
                org.opencds.cqf.cql.elm.execution.Sum.class,
                org.opencds.cqf.cql.elm.execution.Time.class,
                org.opencds.cqf.cql.elm.execution.TimeFrom.class,
                org.opencds.cqf.cql.elm.execution.TimeOfDay.class,
                org.opencds.cqf.cql.elm.execution.TimezoneFrom.class,
                org.opencds.cqf.cql.elm.execution.ToBoolean.class,
                org.opencds.cqf.cql.elm.execution.ToConcept.class,
                org.opencds.cqf.cql.elm.execution.ToDate.class,
                org.opencds.cqf.cql.elm.execution.ToDateTime.class,
                org.opencds.cqf.cql.elm.execution.Today.class,
                org.opencds.cqf.cql.elm.execution.ToDecimal.class,
                org.opencds.cqf.cql.elm.execution.ToInteger.class,
                org.opencds.cqf.cql.elm.execution.ToList.class,
                org.opencds.cqf.cql.elm.execution.ToQuantity.class,
                org.opencds.cqf.cql.elm.execution.ToString.class,
                org.opencds.cqf.cql.elm.execution.ToTime.class,
                org.opencds.cqf.cql.elm.execution.Truncate.class,
                org.opencds.cqf.cql.elm.execution.TruncatedDivide.class,
                org.opencds.cqf.cql.elm.execution.Tuple.class,
                org.opencds.cqf.cql.elm.execution.Union.class,
                org.opencds.cqf.cql.elm.execution.Upper.class,
                org.opencds.cqf.cql.elm.execution.ValueSetRef.class,
                org.opencds.cqf.cql.elm.execution.Variance.class,
                org.opencds.cqf.cql.elm.execution.Width.class,
                org.opencds.cqf.cql.elm.execution.Xor.class
        );
        simpleModule.setMixInAnnotation(TypeSpecifier.class, org.opencds.cqf.cql.elm.execution.TypeSpecifierMixin.class);
        simpleModule.registerSubtypes(TupleTypeSpecifier.class, NamedTypeSpecifier.class, ChoiceTypeSpecifier.class, IntervalTypeSpecifier.class, ListTypeSpecifier.class);
        mapper.registerModule(simpleModule);
        Library result = mapper.readValue(reader, Library.class);

        if (result.getStatements() != null && result.getStatements().getDef().size() > 0) {
            ArrayList<org.opencds.cqf.cql.elm.execution.ExpressionDef> defs = new ArrayList<>();
            for (org.cqframework.cql.elm.execution.ExpressionDef def : result.getStatements().getDef()) {
                defs.add((ExpressionDef) new ExpressionDef().withName(def.getName())
                        .withResultTypeName(def.getResultTypeName())
                        .withAccessLevel(def.getAccessLevel())
                        .withAnnotation(def.getAnnotation())
                        .withContext(def.getContext())
                        .withExpression(def.getExpression())
                        .withLocalId(def.getLocalId())
                        .withLocator(def.getLocator())
                        .withResultTypeSpecifier(def.getResultTypeSpecifier())
                );
            }
            result.getStatements().getDef().clear();
            result.getStatements().getDef().addAll(defs);
        }

        return result;
    }
}
