package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a/span[1]")
    public WebElement plusIcon;
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]")

    public WebElement firstRow;
    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[2]/td[2]/a/span/span")

    public WebElement FirstRow;
    @FindBy(xpath = " //table[@id='filestable']/tbody/tr[2]/td/a/span/span")
    public WebElement firstRowAfterCopying;
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[1]/span[2]")
    public WebElement firstRowEx;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[3]/td[2]/a/span[1]/span[1]")
    public WebElement secondRow;







    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[3]/td[2]/a/span[1]/span[2]")
    public WebElement secondRowEx;

    @FindBy(xpath = "//span[@class='displayname']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement threeDots;

    //*[@id="fileList"]/tr[1]/td[2]/a/span[3]/a[2]
    //*[@id="fileList"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]
    //*[@id="fileList"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]

    //table[@id='filestable']//tbody/tr[1]/td[2]/a[1]/span[3]/a[2]


    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderPlaceHolder;


    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolderButton;
    //*[@id="controls"]/div[2]/div[2]/ul/li[2]/a
    //span[@class='icon icon-folder svg']

    //span[@class='icon icon-folder svg']
    //span[.='New folder']

    @FindBy(id = "view11-input-folder")
    public WebElement newFolderButtonName;
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]")
    public WebElement uploadFolderNameConfirm;

    @FindBy(xpath = "//div[@class='tooltip-inner']")
    //div[@class='tooltip-inner']

    //*[@id="tooltip835056"]/div[2]
    public WebElement newFolderAlreadyExistMessage;

    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div[2]/div/h2")
    public WebElement newFolderNewWindow;

    @FindBy(xpath = "//li[contains(@class, 'action-delete')]/a[contains(@class, 'delete')]")
//*[@id="rightClickMenu"]/ul/li[7]/a/span[1]
//*[@id="rightClickMenu"]/ul/li[7]
//*[@id="rightClickMenu"]/ul/li[7]/a/span[1]
//span[@class='icon icon-delete']
    public WebElement deleteButton;


//+++++++++++++++++++====++++totoal number of files

    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[1]")
    public WebElement totalFolders;

    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[3]")
    public WebElement totalFiles;


    //___________________________________________________________________NEWTEXTFILE


    @FindBy(xpath = "//input[@id='view11-input-file']")
    public WebElement fileNameInputBox;

    @FindBy(xpath = "//span[.='New text file']")
    public WebElement newTextFileButton;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement newTextFileConfirmButton;


    @FindBy(xpath = "//div[@class='reason']")
    public WebElement recentlyAddedFileOrFolder;


    //________________________________________________________move or copy


    @FindBy(xpath = "//span[@class='icon icon icon-external']")
    public WebElement moveOrCopyButton;


    @FindBy(xpath = "//button[contains(text(), 'Copy to')]\n")
    //button[@class='primary' and text()='Copy to New folder']


    public WebElement copyButton;

    @FindBy(xpath = "//button[contains(text(), 'Move to')]\n")
    //button[@class='' and text()='Move to New folder']

    public WebElement moveButton;

    @FindBy(xpath = "//*[@id=\"picker-filestable\"]/tbody/tr/td[1]/span/span[1]")
    public WebElement chooseTargetFileWindowFirstRow;

    @FindBy(xpath = "//a[@class='menuitem action action-movecopy permanent' and @data-action='MoveCopy']\n")
    public WebElement copyOrMove;


    @FindBy(xpath = "//div[contains(@class, 'toastify') and contains(text(), 'Could not move \"b\", target exists')]\n")
    public WebElement targetExistMessage;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement fileXButton;

    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement fileNameAlreadyExistMessage;
    @FindBy(xpath = "//h2[@class='oc-dialog-title']")
    public WebElement chooseTargetFileWindow;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr/td[2]/a/span[1]/span")
    //span[@class='innernametext']
    //table[@id='filestable']/tbody/tr/td[2]/a/span/span
    //table[@id='filestable']/tbody/tr/td[2]/a/span[1]/span
    public WebElement targetFileFirstRow;



    @FindBy(xpath = "//a[@class='icon icon-add button button-add']")
    public WebElement targetFilePlusIcon;

    @FindBy(xpath = "//input[@value='New folder']")
    //input[@value='New folder']
    //form[@class='filenameform']/input
    //input[@id='initial-state-text-workspace_available']
    //form[@class='filenameform']/input
    //form[@class='filenameform']/input[@class='icon-confirm']
   //form[@class='filenameform']/input[@value='New folder']



    public WebElement targetFileNameInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement targetFileNameConfirmButton;


    @FindBy(xpath = "//div[@data-dir='//New folder']")
    public WebElement targetFileNewFolder;










}
