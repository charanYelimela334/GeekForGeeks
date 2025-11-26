from collections import Counter
class Solution:
    def countFreq(self, arr):
        #code here
        freq=Counter(arr)
        return [list(pair) for pair in freq.items()]