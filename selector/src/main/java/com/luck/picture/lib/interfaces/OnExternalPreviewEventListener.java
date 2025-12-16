package com.luck.picture.lib.interfaces;

import android.content.Context;
import androidx.fragment.app.Fragment;

import com.luck.picture.lib.entity.LocalMedia;

/**
 * @author：luck
 * @date：2021/11/24 7:30 下午
 * @describe：OnExternalPreviewEventListener
 */
public interface OnExternalPreviewEventListener {
    /**
     * 删除图片，由外部弹窗确认后调用Fragment执行删除
     *
     * @param fragment 当前预览Fragment
     * @param position 删除的下标
     */
    void onPreviewDelete(Fragment fragment, int position);

    /**
     * 长按下载
     *
     * @param media 资源
     * @return true 自己实现下载逻辑；默认false
     */
    boolean onLongPressDownload(Context context, LocalMedia media);

}
