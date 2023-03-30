package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesButton;
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a/span[1]")
    public WebElement plusIcon;
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[3]/a[2]/span[1]")

    public WebElement threeDots;

    @FindBy(xpath = "//a[@class='action action-menu permanent']/span[1]")
    public WebElement targetFileTreeDots;
    @FindBy(xpath = "//span[@class='icon icon-folder svg']")
    public WebElement newFolderButton;
    @FindBy(id = "view11-input-folder")
    public WebElement newFolderButtonName;
    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]")
    public WebElement uploadFolderNameConfirm;
    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement newFolderAlreadyExistMessage;
    @FindBy(xpath = "//*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div[2]/div/h2")
    public WebElement newFolderNewWindow;
    @FindBy(xpath = "//li[contains(@class, 'action-delete')]/a[contains(@class, 'delete')]")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[1]")
    public WebElement totalFolders;
    @FindBy(xpath = "//*[@id=\"filestable\"]/tfoot/tr/td[2]/span/span[3]")
    public WebElement totalFiles;
    @FindBy(xpath = "//input[@id='view11-input-file']")
    public WebElement fileNameInputBox;
    @FindBy(xpath = "//span[.='New text file']")
    public WebElement newTextFileButton;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement newTextFileConfirmButton;
    @FindBy(xpath = "//button[contains(text(), 'Copy to')]\n")
    public WebElement copyButton;
    @FindBy(xpath = "//*[@id=\"body-user\"]/div[10]/div[2]/button[1]")
    public WebElement newFileCopyButton;
    @FindBy(xpath = "//button[contains(text(), 'Move to')]\n")
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
    public WebElement targetFileFirstRow;
    @FindBy(xpath = "//a[@class='icon icon-add button button-add']")
    public WebElement targetFilePlusIcon;
    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement targetFileNameInputBox;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement targetFileNameConfirmButton;
    @FindBy(xpath = " //h2[.='Choose target folder']")
    public WebElement targetFileNewFolder;
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveButtonNewFile;
    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> tableElements;

    @FindBy(xpath = "//a[@class='action action-menu permanent' and @title=''][span[@class='icon icon-more'] and span[text()='Actions']]\n")
    public WebElement targetFilethreeDot;
    @FindBy(xpath = "//a[contains(@class, 'menuitem') and contains(@class, 'action-delete') and contains(@class, 'permanent') and @data-action='Delete' and span[@class='icon icon-delete'] and span[text()='Delete folder']]\n")
    public WebElement targetFileDeleteButton;
    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[2]/a/span[1]")
    public List<WebElement> tableFilesName;












}
