package entity;

public class t_role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.id
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_name
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.note
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.id
     *
     * @return the value of t_role.id
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.id
     *
     * @param id the value for t_role.id
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_name
     *
     * @return the value of t_role.role_name
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_name
     *
     * @param roleName the value for t_role.role_name
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.note
     *
     * @return the value of t_role.note
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.note
     *
     * @param note the value for t_role.note
     *
     * @mbggenerated Wed Jun 09 13:14:28 CST 2021
     */
    public void setNote(String note) {
        this.note = note;
    }
}