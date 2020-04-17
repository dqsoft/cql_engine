package org.opencds.cqf.cql.elm.execution;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactoryEx extends org.cqframework.cql.elm.execution.ObjectFactory {
    @Override
    public org.cqframework.cql.elm.execution.Abs createAbs() { return new AbsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Add createAdd() { return new AddEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.After createAfter() { return new AfterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.AliasRef createAliasRef() { return new AliasRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.AllTrue createAllTrue() { return new AllTrueEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.And createAnd() { return new AndEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.AnyTrue createAnyTrue() { return new AnyTrueEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.AnyInValueSet createAnyInValueSet() { return new AnyInValueSetEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.As createAs() { return new AsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Avg createAvg() { return new AvgEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Before createBefore() { return new BeforeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CalculateAge createCalculateAge() { return new CalculateAgeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CalculateAgeAt createCalculateAgeAt() { return new CalculateAgeAtEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Case createCase() { return new CaseEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Ceiling createCeiling() { return new CeilingEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Children createChildren() { return new ChildrenEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Coalesce createCoalesce() { return new CoalesceEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Code createCode() { return new CodeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CodeDef createCodeDef() { return new CodeDefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CodeRef createCodeRef() { return new CodeRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CodeSystemDef createCodeSystemDef() { return new CodeSystemDefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.CodeSystemRef createCodeSystemRef() { return new CodeSystemRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Collapse createCollapse() { return new CollapseEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Combine createCombine() { return new CombineEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Concatenate createConcatenate() { return new ConcatenateEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Concept createConcept() { return new ConceptEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Contains createContains() { return new ContainsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Convert createConvert() { return new ConvertEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Count createCount() { return new CountEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Date createDate() { return new DateEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.DateTime createDateTime() { return new DateTimeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.DateFrom createDateFrom() { return new DateFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.DateTimeComponentFrom createDateTimeComponentFrom() { return new DateTimeComponentFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Descendents createDescendents() { return new DescendentsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.DifferenceBetween createDifferenceBetween() { return new DifferenceBetweenEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Distinct createDistinct() { return new DistinctEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Divide createDivide() { return new DivideEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.DurationBetween createDurationBetween() { return new DurationBetweenEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.End createEnd() { return new EndEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Ends createEnds() { return new EndsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.EndsWith createEndsWith() { return new EndsWithEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Equal createEqual() { return new EqualEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Equivalent createEquivalent() { return new EquivalentEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Except createExcept() { return new ExceptEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Exists createExists() { return new ExistsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Exp createExp() { return new ExpEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Expand createExpand() { return new ExpandEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ExpressionDef createExpressionDef() { return new ExpressionDefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ExpressionRef createExpressionRef() { return new ExpressionRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Filter createFilter() { return new FilterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.First createFirst() { return new FirstEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Flatten createFlatten() { return new FlattenEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Floor createFloor() { return new FloorEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ForEach createForEach() { return new ForEachEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.FunctionRef createFunctionRef() { return new FunctionRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.GeometricMean createGeometricMean() { return new GeometricMeanEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Greater createGreater() { return new GreaterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.GreaterOrEqual createGreaterOrEqual() { return new GreaterOrEqualEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IdentifierRef createIdentifierRef() { return new IdentifierRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.If createIf() { return new IfEvaluator(); }

     @Override
     public org.cqframework.cql.elm.execution.Implies createImplies() { return new ImpliesEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IncludedIn createIncludedIn() { return new IncludedInEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Includes createIncludes() { return new IncludesEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Indexer createIndexer() { return new IndexerEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IndexOf createIndexOf() { return new IndexOfEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.In createIn() { return new InEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.InCodeSystem createInCodeSystem() { return new InCodeSystemEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.InValueSet createInValueSet() { return new InValueSetEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Instance createInstance() { return new InstanceEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Intersect createIntersect() { return new IntersectEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Interval createInterval() { return new IntervalEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Is createIs() { return new IsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IsFalse createIsFalse() { return new IsFalseEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IsNull createIsNull() { return new IsNullEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.IsTrue createIsTrue() { return new IsTrueEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Last createLast() { return new LastEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.LastPositionOf createLastPositionOf() { return new LastPositionOfEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Length createLength() { return new LengthEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Less createLess() { return new LessEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.LessOrEqual createLessOrEqual() { return new LessOrEqualEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.List createList() { return new ListEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Literal createLiteral() { return new LiteralEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Ln createLn() { return new LnEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Log createLog() { return new LogEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Lower createLower() { return new LowerEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Matches createMatches() { return new MatchesEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.MaxValue createMaxValue() { return new MaxValueEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Max createMax() { return new MaxEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Median createMedian() { return new MedianEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Meets createMeets() { return new MeetsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.MeetsAfter createMeetsAfter() { return new MeetsAfterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.MeetsBefore createMeetsBefore() { return new MeetsBeforeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Message createMessage() { return new MessageEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.MinValue createMinValue() { return new MinValueEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Min createMin() { return new MinEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Mode createMode() { return new ModeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Modulo createModulo() { return new ModuloEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Multiply createMultiply() { return new MultiplyEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Negate createNegate() { return new NegateEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.NotEqual createNotEqual() { return new NotEqualEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Not createNot() { return new NotEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Now createNow() { return new NowEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Null createNull() { return new NullEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.OperandRef createOperandRef() { return new OperandRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Or createOr() { return new OrEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Overlaps createOverlaps() { return new OverlapsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.OverlapsBefore createOverlapsBefore() { return new OverlapsBeforeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.OverlapsAfter createOverlapsAfter() { return new OverlapsAfterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ParameterRef createParameterRef() { return new ParameterRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.PointFrom createPointFrom() { return new PointFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.PopulationStdDev createPopulationStdDev() { return new PopulationStdDevEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.PopulationVariance createPopulationVariance() { return new PopulationVarianceEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.PositionOf createPositionOf() { return new PositionOfEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Power createPower() { return new PowerEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Predecessor createPredecessor() { return new PredecessorEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Product createProduct() { return new ProductEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ProperContains createProperContains() { return new ProperContainsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ProperIn createProperIn() { return new ProperInEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ProperIncludes createProperIncludes() { return new ProperlyIncludesEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ProperIncludedIn createProperIncludedIn() { return new ProperlyIncludedInEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Property createProperty() { return new PropertyEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Quantity createQuantity() { return new QuantityEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Query createQuery() { return new QueryEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.QueryLetRef createQueryLetRef() { return new QueryLetRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Repeat createRepeat() { return new RepeatEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ReplaceMatches createReplaceMatches() { return new ReplaceMatchesEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Retrieve createRetrieve() { return new RetrieveEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Round createRound() { return new RoundEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.SameAs createSameAs() { return new SameAsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.SameOrAfter createSameOrAfter() { return new SameOrAfterEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.SameOrBefore createSameOrBefore() { return new SameOrBeforeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.SingletonFrom createSingletonFrom() { return new SingletonFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Slice createSlice() { return new SliceEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Split createSplit() { return new SplitEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Start createStart() { return new StartEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Starts createStarts() { return new StartsEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.StartsWith createStartsWith() { return new StartsWithEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.StdDev createStdDev() { return new StdDevEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Substring createSubstring() { return new SubstringEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Subtract createSubtract() { return new SubtractEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Successor createSuccessor() { return new SuccessorEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Sum createSum() { return new SumEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Time createTime() { return new TimeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.TimeOfDay createTimeOfDay() { return new TimeOfDayEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.TimeFrom createTimeFrom() { return new TimeFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.TimezoneFrom createTimezoneFrom() { return new TimezoneFromEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Today createToday() { return new TodayEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToBoolean createToBoolean() { return new ToBooleanEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToConcept createToConcept() { return new ToConceptEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToDecimal createToDecimal() { return new ToDecimalEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToDate createToDate() { return new ToDateEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToDateTime createToDateTime() { return new ToDateTimeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToInteger createToInteger() { return new ToIntegerEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToList createToList() { return new ToListEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToQuantity createToQuantity() { return new ToQuantityEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToString createToString() { return new ToStringEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ToTime createToTime() { return new ToTimeEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.TruncatedDivide createTruncatedDivide() { return new TruncatedDivideEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Truncate createTruncate() { return new TruncateEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Tuple createTuple() { return new TupleEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Union createUnion() { return new UnionEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Upper createUpper() { return new UpperEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Variance createVariance() { return new VarianceEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.ValueSetRef createValueSetRef() { return new ValueSetRefEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Width createWidth() { return new WidthEvaluator(); }

    @Override
    public org.cqframework.cql.elm.execution.Xor createXor() { return new XorEvaluator(); }
}
