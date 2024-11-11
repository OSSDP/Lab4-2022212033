package xyh;

import org.junit.Test;
import org.xyh.Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    // 测试目的：验证findRepeatedDnaSequences方法能正确找出长度为10的重复DNA序列
    // 预期结果：对于重复的序列，方法应返回包含这些序列的列表；对于不重复或长度不足的序列，返回空列表或相应的结果
    @Test
    public void testFindRepeatedDnaSequences_WithRepeats() {
        Solution solution = new Solution();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }

    // 测试目的：验证findRepeatedDnaSequences方法在字符串长度小于10时返回空列表
    // 预期结果：返回空列表
    @Test
    public void testFindRepeatedDnaSequences_LengthLessThan10() {
        Solution solution = new Solution();
        String s = "AAAACCCC";
        List<String> expected = Collections.emptyList();
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindRepeatedDnaSequences() {
        Solution solution = new Solution();

        // 测试用例1
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected1 = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertEquals(expected1, solution.findRepeatedDnaSequences(s1));

        // 测试用例2
        String s2 = "AAAAAAAAAAAAA";
        List<String> expected2 = Arrays.asList("AAAAAAAAAA");
        assertEquals(expected2, solution.findRepeatedDnaSequences(s2));

        // 测试用例3：没有重复序列
        String s3 = "ACGTACGTACGT";
        List<String> expected3 = Arrays.asList();
        assertEquals(expected3, solution.findRepeatedDnaSequences(s3));

        // 测试用例4：序列长度小于10
        String s4 = "ACGT";
        List<String> expected4 = Arrays.asList();
        assertEquals(expected4, solution.findRepeatedDnaSequences(s4));

        // 测试用例5：包含多种重复序列
        String s5 = "ATCGATCGATCGAATCGAATCG";
        List<String> expected5 = Arrays.asList("ATCGATCGAT", "CGATCGATCG");
        assertEquals(expected5, solution.findRepeatedDnaSequences(s5));
    }

}