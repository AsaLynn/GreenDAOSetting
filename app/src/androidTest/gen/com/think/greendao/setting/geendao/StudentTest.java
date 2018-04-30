package com.think.greendao.setting.geendao;

import org.greenrobot.greendao.test.AbstractDaoTestLongPk;

import com.think.greendao.setting.entity.Student;
import com.think.greendao.setting.geendao.StudentDao;

public class StudentTest extends AbstractDaoTestLongPk<StudentDao, Student> {

    public StudentTest() {
        super(StudentDao.class);
    }

    @Override
    protected Student createEntity(Long key) {
        Student entity = new Student();
        entity.setId(key);
        return entity;
    }

}
