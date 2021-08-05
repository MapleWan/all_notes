import numpy as np
from scipy.sparse import csc_matrix
from scipy.sparse import csr_matrix
from scipy.sparse import coo_matrix

indptr = np.array([0, 2, 3, 6])#0表示默认起始点，0之后有几个数字就表示有几行
indices = np.array([0, 2, 2, 0, 1, 2])
data = np.array([1, 2, 3, 4, 5, 6])
tmp = csr_matrix((data, indices, indptr), shape=(3, 3)).toarray()
print(tmp)

row  = np.array([0, 3, 1, 0])
col  = np.array([0, 3, 1, 2])
data = np.array([4, 5, 7, 9])
coo_matrix((data, (row, col)), shape=(4, 4)).toarray()
print(tmp)
