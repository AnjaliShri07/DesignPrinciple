package org.programs.ISP;

public class Editor implements ReadPermission, WritePermission {
    public void viewData() {
        System.out.println("Viewing data...");
    }
    public void modifyData() {
        System.out.println("Modifying data...");
    }
}

/*✅ Why? A Viewer shouldn’t be forced to implement modifyData().*/
