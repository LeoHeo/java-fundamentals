## 피보나치 구현 2가지

### Test case
- [nano time test](./CacheFiboTest.java)

### 왜 시간 차이가 나는가?
- 일반적인 피보나치는 `O(n^2)`이라서 n이 아주 작을때를 제외하고는 상당히 비효율적이다.
- 하지만 `Memoization`을 하는 피보나치의 경우 `O(n)`이다.