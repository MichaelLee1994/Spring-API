package com.company.project.core;

/**
 * constants in the project
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.company.project";//company name

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";//package name containing model
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";//package name containing Mapper
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//package name containing Service
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//package name containing ServiceImpl
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";//package name containing Controller

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";//mapper interface ref name
}
