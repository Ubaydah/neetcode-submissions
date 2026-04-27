class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        list1 = list(s)
        list2 = list(t)

        sort1 = sorted(list1)
        sort2 = sorted(list2)

        return sort1 == sort2