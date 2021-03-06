package com.exam.service;

import com.exam.domain.Employee;
import com.exam.domain.Manager;
import com.exam.domain.Task;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAppObserver extends Remote {
    void updateAdministratorWindow(Employee employee, Manager manager, Boolean isDelete) throws RemoteException;

    void updateWindows(Task task) throws RemoteException;

    void employeeLoggedIn(Employee employee) throws RemoteException;

    void employeeLoggedOut(Employee employee) throws RemoteException;
}
