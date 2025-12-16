package com.luck.picture.lib.style;

/**
 * @author：luck
 * @date：2021/11/15 4:15 下午
 * @describe：titleBarStyle
 */
public class TitleBarStyle {
    /**
     * 是否隐藏标题栏
     */
    private boolean isHideTitleBar;
    /**
     * 标题栏左边关闭样式
     */
    private int titleLeftBackResource;

    /**
     * 预览标题栏左边关闭样式
     */
    private int previewTitleLeftBackResource;

    /**
     * 预览标题栏左侧图标tint颜色
     */
    private int previewTitleLeftBackTintColor;

    /**
     * 预览标题栏左侧图标marginStart，单位dp
     */
    private int previewTitleLeftBackMarginStart;

    /**
     * 标题栏默认文案
     */
    private String titleDefaultText;

    /**
     * 标题栏默认文案
     */
    private int titleDefaultTextResId;

    /**
     * 标题栏字体大小
     */
    private int titleTextSize;
    /**
     * 标题栏字体色值
     */
    private int titleTextColor;
    /**
     * 标题栏背景
     */
    private int titleBackgroundColor;

    /**
     * 预览标题栏背景
     */
    private int previewTitleBackgroundColor;

    /**
     * 标题栏高度
     * <p>
     * use  unit dp
     * </p>
     */
    private int titleBarHeight;

    /**
     * 标题栏专辑背景
     */
    private int titleAlbumBackgroundResource;

    /**
     * 标题栏位置居左
     */
    private boolean isAlbumTitleRelativeLeft;


    /**
     * 标题栏右边向上图标
     */
    private int titleDrawableRightResource;

    /**
     * 标题栏右边取消按钮背景
     */
    private int titleCancelBackgroundResource;

    /**
     * 是否隐藏取消按钮
     */
    private boolean isHideCancelButton;

    /**
     * 外部预览删除
     */
    private int previewDeleteBackgroundResource;

    /**
     * 外部预览删除图标tint颜色
     */
    private int previewDeleteTintColor;

    /**
     * 外部预览删除图标marginEnd，单位dp
     */
    private int previewDeleteMarginEnd;

    /**
     * 标题栏右边默认文本
     */
    private String titleCancelText;

    /**
     * 标题栏右边默认文本
     */
    private int titleCancelTextResId;

    /**
     * 标题栏右边文本字体大小
     */
    private int titleCancelTextSize;
    /**
     * 标题栏右边文本字体色值
     */
    private int titleCancelTextColor;

    /**
     * 标题栏底部线条色值
     */
    private int titleBarLineColor;

    /**
     * 是否显示标题栏底部线条
     */
    private boolean isDisplayTitleBarLine;

    public TitleBarStyle() {
    }

    public boolean isHideTitleBar() {
        return isHideTitleBar;
    }

    public void setHideTitleBar(boolean hideTitleBar) {
        isHideTitleBar = hideTitleBar;
    }

    public int getTitleLeftBackResource() {
        return titleLeftBackResource;
    }

    public void setTitleLeftBackResource(int titleLeftBackResource) {
        this.titleLeftBackResource = titleLeftBackResource;
    }

    public int getPreviewTitleLeftBackResource() {
        return previewTitleLeftBackResource;
    }

    public void setPreviewTitleLeftBackResource(int previewTitleLeftBackResource) {
        this.previewTitleLeftBackResource = previewTitleLeftBackResource;
    }

    public int getPreviewTitleLeftBackTintColor() {
        return previewTitleLeftBackTintColor;
    }

    public void setPreviewTitleLeftBackTintColor(int color) {
        this.previewTitleLeftBackTintColor = color;
    }

    public int getPreviewTitleLeftBackMarginStart() {
        return previewTitleLeftBackMarginStart;
    }

    public void setPreviewTitleLeftBackMarginStart(int dp) {
        this.previewTitleLeftBackMarginStart = dp;
    }

    public String getTitleDefaultText() {
        return titleDefaultText;
    }

    public void setTitleDefaultText(String titleDefaultText) {
        this.titleDefaultText = titleDefaultText;
    }

    public int getTitleDefaultTextResId() {
        return titleDefaultTextResId;
    }

    public void setTitleDefaultText(int resId) {
        this.titleDefaultTextResId = resId;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public void setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    public int getTitleBackgroundColor() {
        return titleBackgroundColor;
    }

    public void setTitleBackgroundColor(int titleBackgroundColor) {
        this.titleBackgroundColor = titleBackgroundColor;
    }

    public int getPreviewTitleBackgroundColor() {
        return previewTitleBackgroundColor;
    }

    public void setPreviewTitleBackgroundColor(int previewTitleBackgroundColor) {
        this.previewTitleBackgroundColor = previewTitleBackgroundColor;
    }

    public int getTitleBarHeight() {
        return titleBarHeight;
    }

    public void setTitleBarHeight(int titleBarHeight) {
        this.titleBarHeight = titleBarHeight;
    }

    public int getTitleAlbumBackgroundResource() {
        return titleAlbumBackgroundResource;
    }

    public void setTitleAlbumBackgroundResource(int titleAlbumBackgroundResource) {
        this.titleAlbumBackgroundResource = titleAlbumBackgroundResource;
    }

    public boolean isAlbumTitleRelativeLeft() {
        return isAlbumTitleRelativeLeft;
    }

    public void setAlbumTitleRelativeLeft(boolean albumTitleRelativeLeft) {
        isAlbumTitleRelativeLeft = albumTitleRelativeLeft;
    }

    public int getTitleDrawableRightResource() {
        return titleDrawableRightResource;
    }

    public void setTitleDrawableRightResource(int titleDrawableRightResource) {
        this.titleDrawableRightResource = titleDrawableRightResource;
    }

    public int getTitleCancelBackgroundResource() {
        return titleCancelBackgroundResource;
    }

    public void setTitleCancelBackgroundResource(int titleCancelBackgroundResource) {
        this.titleCancelBackgroundResource = titleCancelBackgroundResource;
    }

    public boolean isHideCancelButton() {
        return isHideCancelButton;
    }

    public void setHideCancelButton(boolean hideCancelButton) {
        isHideCancelButton = hideCancelButton;
    }

    public int getPreviewDeleteBackgroundResource() {
        return previewDeleteBackgroundResource;
    }

    public void setPreviewDeleteBackgroundResource(int previewDeleteBackgroundResource) {
        this.previewDeleteBackgroundResource = previewDeleteBackgroundResource;
    }

    public int getPreviewDeleteTintColor() {
        return previewDeleteTintColor;
    }

    public void setPreviewDeleteTintColor(int color) {
        this.previewDeleteTintColor = color;
    }

    public int getPreviewDeleteMarginEnd() {
        return previewDeleteMarginEnd;
    }

    public void setPreviewDeleteMarginEnd(int dp) {
        this.previewDeleteMarginEnd = dp;
    }

    public String getTitleCancelText() {
        return titleCancelText;
    }

    public void setTitleCancelText(String titleCancelText) {
        this.titleCancelText = titleCancelText;
    }

    public int getTitleCancelTextResId() {
        return titleCancelTextResId;
    }

    public void setTitleCancelText(int resId) {
        this.titleCancelTextResId = resId;
    }

    public int getTitleCancelTextSize() {
        return titleCancelTextSize;
    }

    public void setTitleCancelTextSize(int titleCancelTextSize) {
        this.titleCancelTextSize = titleCancelTextSize;
    }

    public int getTitleCancelTextColor() {
        return titleCancelTextColor;
    }

    public void setTitleCancelTextColor(int titleCancelTextColor) {
        this.titleCancelTextColor = titleCancelTextColor;
    }

    public int getTitleBarLineColor() {
        return titleBarLineColor;
    }

    public void setTitleBarLineColor(int titleBarLineColor) {
        this.titleBarLineColor = titleBarLineColor;
    }

    public boolean isDisplayTitleBarLine() {
        return isDisplayTitleBarLine;
    }

    public void setDisplayTitleBarLine(boolean displayTitleBarLine) {
        isDisplayTitleBarLine = displayTitleBarLine;
    }
}
