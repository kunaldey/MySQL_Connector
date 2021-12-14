package com.aafes.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Execution {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="testID")
    private String testID;
    @Column(name="testStep")
    private String testStep;
    @Column(name="testDescription")
    private String testDescription;
    @Column(name="testStatus")
    private String testStatus;
    @Column(name="screenshot")
    private String screenshot;
    @Column(name="date")
    private String date;
    @Column(name="time")
    private String time;
    @Column(name="cycle")
    private String cycle;
    @Column(name="runtime")
    private Integer runtime;
    @Column(name="build")
    private String build;
    @Column(name="testError")
    private String testError;
    @Column(name="errorType")
    private String errorType;
    @Column(name="testPlatform")
    private String testPlatform;
    @Column(name="project")
    private String project;
    @Column(name="endOfTest")
    private String endOfTest;
    @Column(name="node_ip")
    private String node_ip;
    @Column(name="node_port")
    private String node_port;
    @Column(name="session_id")
    private String session_id;
    @Column(name="info1")
    private String info1;
    @Column(name="info2")
    private String info2;
    @Column(name="info3")
    private String info3;
    @Column(name="info4")
    private String info4;
    @Column(name="info5")
    private String info5;
    @Column(name="info6")
    private String info6;

    public Execution() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestID() {
        return testID;
    }

    public void setTestID(String testID) {
        this.testID = testID;
    }

    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getTestError() {
        return testError;
    }

    public void setTestError(String testError) {
        this.testError = testError;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getTestPlatform() {
        return testPlatform;
    }

    public void setTestPlatform(String testPlatform) {
        this.testPlatform = testPlatform;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getEndOfTest() {
        return endOfTest;
    }

    public void setEndOfTest(String endOfTest) {
        this.endOfTest = endOfTest;
    }

    public String getNode_ip() {
        return node_ip;
    }

    public void setNode_ip(String node_ip) {
        this.node_ip = node_ip;
    }

    public String getNode_port() {
        return node_port;
    }

    public void setNode_port(String node_port) {
        this.node_port = node_port;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4;
    }

    public String getInfo5() {
        return info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5;
    }

    public String getInfo6() {
        return info6;
    }

    public void setInfo6(String info6) {
        this.info6 = info6;
    }
}
