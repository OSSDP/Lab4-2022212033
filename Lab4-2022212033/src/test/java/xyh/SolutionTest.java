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
        // 修改预期结果，使其与实际结果不匹配
        List<String> expected = Arrays.asList("XXXXX", "YYYYY"); // 错误的预期结果
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindRepeatedDnaSequences_LengthLessThan10() {
        Solution solution = new Solution();
        String s = "AAAACCCC";
        // 修改预期结果，使其与实际结果不匹配
        List<String> expected = Arrays.asList("AAAACCCC"); // 错误的预期结果，预期应返回空列表
        List<String> actual = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, actual);
    }

}
