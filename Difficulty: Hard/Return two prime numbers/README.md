<h2><a href="https://www.geeksforgeeks.org/problems/return-two-prime-numbers2509/1">Return two prime numbers</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an even number <strong>n </strong>(greater than 2), return two prime numbers whose sum will be equal to the given number. There are several combinations possible. Print only the pair whose minimum value is the smallest among all the minimum values of pairs and print the minimum element first.</span></p>
<p><span style="font-size: 18px;"><strong>NOTE:</strong>&nbsp;A solution will always exist,&nbsp;read&nbsp;<a href="https://en.wikipedia.org/wiki/Goldbach%27s_conjecture" rel="nofollow">Goldbach's conjecture</a>.</span><span style="font-size: 18px;">&nbsp;</span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 74
<strong>Output:</strong> 3 71
<strong>Explaination:</strong> There are several possibilities 
like 37 37. But the minimum value of this pair 
is 3 which is smallest among all possible 
minimum values of all the pairs.</span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 4
<strong>Output:</strong> 2 2
<strong>Explaination:</strong> This is the only possible 
prtitioning of 4.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You do not need to read input or print anything. Your task is to complete the function <strong>primeDivision()</strong> which takes n as input parameter and returns the partition satisfying the condition.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N*log(logN))<br><strong>Expected Auxiliary Space: </strong>O(N)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>4 ≤ n ≤ 10<sup>4</sup>&nbsp;&nbsp;</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Zoho</code>&nbsp;<code>Yahoo</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;<code>sieve</code>&nbsp;