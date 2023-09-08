package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import di3.C86312j;
import gy3.C87412m;
import hh2.C8532a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import p682rz.C36594q;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAudioBgAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "<init>", "()V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAudioBgAlbumUI */
public final class FinderLiveAudioBgAlbumUI extends AlbumPreviewUI {

    /* renamed from: y1 */
    public final int f158958y1 = 10;

    /* renamed from: z1 */
    public final int f158959z1 = 1;

    /* renamed from: U7 */
    public void mo77421U7(int i, View view, int i2) {
        C87412m.m108594g(view, "itemView");
        C93958f.m118755o(this.f271290h.f271541f);
        Intent intent = new Intent(this, ImagePreviewUI.class);
        intent.putStringArrayListExtra("preview_image_list", this.f271290h.mo129055w5());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f271290h.f271542g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", i);
        mo128948Q7(i, true);
        intent.putExtra("send_raw_img", this.f271249F);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("GalleryUI_FromUser", this.f271263S);
        intent.putExtra("GalleryUI_ToUser", this.f271265T);
        intent.putExtra("album_business_tag", this.f271275Y);
        intent.putExtra("album_video_max_duration", ((long) this.f158958y1) * 1000);
        intent.putExtra("album_video_min_duration", this.f271304p0);
        intent.putExtra("media_type", 2);
        intent.putExtra("key_support_max_ratio", 3.0f);
        startActivityForResult(intent, 0);
    }

    /* renamed from: V7 */
    public boolean mo77422V7() {
        RecordConfigProvider recordConfigProvider;
        GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) C110818d0.m150914L(new ArrayList(this.f271290h.f271542g));
        if (galleryItem$MediaItem.getType() == 1) {
            recordConfigProvider = RecordConfigProvider.m119432b(galleryItem$MediaItem.f162747d, "");
            Bundle bundle = new Bundle();
            bundle.putFloat("crop_fix_ratio", 0.75f);
            recordConfigProvider.f272912M = bundle;
        } else {
            recordConfigProvider = RecordConfigProvider.m119433c(galleryItem$MediaItem.f162747d, "", "");
            recordConfigProvider.f272935w = this.f158958y1 * 1000;
            recordConfigProvider.f272936x = this.f158959z1 * 1000;
            recordConfigProvider.f272905F = 17;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 17);
            bundle2.putBoolean("key_mute_video", true);
            recordConfigProvider.f272912M = bundle2;
            recordConfigProvider.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.FinderLiveVideoCompositionPluginLayout");
            recordConfigProvider.f272926n = ((C36594q) C86312j.m106911c(C36594q.class)).mo60737c6();
        }
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
        videoCaptureReportInfo.f272940d = 17;
        recordConfigProvider2.f272908I = videoCaptureReportInfo;
        UICustomParam uICustomParam = new UICustomParam();
        ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
        ((HashMap) uICustomParam.f266575h).put("plugin_music", true);
        recordConfigProvider2.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(getContext(), 4385, -1, -1, recordConfigProvider2, galleryItem$MediaItem.getType() == 1 ? 1 : 2, 0);
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C94049a aVar;
        if (i == 4385) {
            if (i2 == -1) {
                setResult(i2, intent);
                finish();
            }
        } else if (i2 == 34) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (!(stringArrayListExtra == null || (aVar = this.f271290h) == null)) {
                ArrayList<GalleryItem$MediaItem> k = C93958f.m118751k();
                if (k == null) {
                    k = this.f271290h.f271541f;
                }
                aVar.mo129044P5(stringArrayListExtra, k);
                this.f271290h.notifyDataSetChanged();
                mo128958e8(stringArrayListExtra.size());
            }
            mo77422V7();
        }
    }
}
