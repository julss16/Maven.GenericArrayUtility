package com.zipcodewilmington.arrayutility;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

import java.util.Collection;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to test all classes within this package
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        CountDuplicatesInMergeTest.class,
        GetMostCommonFromMergeTest.class,
        GetNumberOfOccurrencesTest.class,
        RemoveValueTest.class
})
public class ArrayUtilityTestSuite {



}
