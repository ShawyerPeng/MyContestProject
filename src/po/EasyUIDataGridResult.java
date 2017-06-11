package po;

import java.util.List;

public class EasyUIDataGridResult {

    /**
     * easyUI dataGrid 返回结果封装
     */
    // 总的记录数
    Long total;
    // 数据集
    List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}