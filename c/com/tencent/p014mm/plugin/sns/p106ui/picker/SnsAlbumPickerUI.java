package com.tencent.p014mm.plugin.sns.p106ui.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C57353d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hh2.C8532a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jr2.C76440q;
import jr2.C99014h;
import kotlin.Metadata;
import lc3.C10485b;
import nj3.C76912y0;
import ob0.C117747y;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import xb0.C102609h;
import yu2.C102914a;
import yu2.C102919a0;
import yu2.C102921b0;
import yu2.C102922c0;
import yu2.C102923d;
import yu2.C102944e0;
import yu2.C102948i;
import yu2.C102958q;
import yu2.C102959r;
import yu2.C102960s;
import yu2.C102961t;
import yu2.C102962u;
import yu2.C102963v;
import yu2.C102964x;
import yu2.C102965y;
import yu2.C102966z;
import yu2.C16074c;
import yu2.C16075d0;
import yu2.C66702w;
import z04.C112550d0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI */
public final class SnsAlbumPickerUI extends MMActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f280763B = 0;

    /* renamed from: A */
    public final C96126g f280764A = new C96126g(this);

    /* renamed from: d */
    public boolean f280765d;

    /* renamed from: e */
    public boolean f280766e;

    /* renamed from: f */
    public C5431p1.C5432a f280767f;

    /* renamed from: g */
    public final C13601g f280768g = C36568h.m40985a(C96123d.f280788d);

    /* renamed from: h */
    public String f280769h = "";

    /* renamed from: i */
    public int f280770i;

    /* renamed from: j */
    public boolean f280771j = true;

    /* renamed from: n */
    public String f280772n = "";

    /* renamed from: o */
    public String f280773o = "";

    /* renamed from: p */
    public long f280774p;

    /* renamed from: q */
    public boolean f280775q;

    /* renamed from: r */
    public boolean f280776r;

    /* renamed from: s */
    public final C13601g f280777s = C36568h.m40985a(new C96121b(this));

    /* renamed from: t */
    public final C13601g f280778t = C36568h.m40985a(new C96122c(this));

    /* renamed from: u */
    public final C13601g f280779u = C36568h.m40985a(new C96125f(this));

    /* renamed from: v */
    public C89779i0 f280780v;

    /* renamed from: w */
    public final C13601g f280781w = C36568h.m40985a(new C96124e(this));

    /* renamed from: x */
    public final C13601g f280782x = C36568h.m40985a(new C96129h(this));

    /* renamed from: y */
    public final Runnable f280783y = new C96130i(this);

    /* renamed from: z */
    public final C102914a.C102915a f280784z = new C96120a(this);

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$a */
    public static final class C96120a implements C102914a.C102915a {

        /* renamed from: a */
        public final /* synthetic */ SnsAlbumPickerUI f280785a;

        public C96120a(SnsAlbumPickerUI snsAlbumPickerUI) {
            this.f280785a = snsAlbumPickerUI;
        }

        /* renamed from: a */
        public void mo133700a(ArrayList<String> arrayList, boolean z) {
            String str;
            String str2;
            int i;
            int i2;
            int i3;
            C96120a aVar = this;
            boolean z2 = z;
            String str3 = "onCompleted";
            String str4 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$downLoadCallback$1";
            SnsMethodCalculate.markStartTimeMs(str3, str4);
            C87412m.m108594g(arrayList, "snsStoragePathList");
            StringBuilder sb = new StringBuilder();
            sb.append("downLoadCallback onCompleted snsStoragePathList size:");
            sb.append(arrayList.size());
            sb.append(", isAllPhoto:");
            sb.append(z2);
            sb.append(", IsCancelCurDownload:");
            SnsAlbumPickerUI snsAlbumPickerUI = aVar.f280785a;
            int i4 = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean z3 = snsAlbumPickerUI.f280776r;
            SnsMethodCalculate.markEndTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            sb.append(z3);
            Log.m105924i("MicroMsg.SnsAlbumPickerUI", sb.toString());
            SnsAlbumPickerUI snsAlbumPickerUI2 = aVar.f280785a;
            SnsMethodCalculate.markStartTimeMs("access$hideMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI2.getClass();
            SnsMethodCalculate.markStartTimeMs("hideMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            C89779i0 i0Var = snsAlbumPickerUI2.f280780v;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SnsMethodCalculate.markEndTimeMs("hideMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("access$hideMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI3 = aVar.f280785a;
            SnsMethodCalculate.markStartTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean z4 = snsAlbumPickerUI3.f280776r;
            SnsMethodCalculate.markEndTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (!z4) {
                SnsAlbumPickerUI snsAlbumPickerUI4 = aVar.f280785a;
                SnsMethodCalculate.markStartTimeMs("access$enterMMRecordVLogUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                snsAlbumPickerUI4.getClass();
                Class cls = C10485b.class;
                SnsMethodCalculate.markStartTimeMs("enterMMRecordVLogUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                Log.m105924i("MicroMsg.SnsAlbumPickerUI", "enterMMRecordVLogUI start");
                if (arrayList.isEmpty()) {
                    Log.m105924i("MicroMsg.SnsAlbumPickerUI", "enterMMRecordVLogUI , but FilePathList count = 0 , passed");
                    SnsMethodCalculate.markEndTimeMs("enterMMRecordVLogUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    str2 = str3;
                    str = str4;
                } else {
                    C13601g a = C36568h.m40985a(C16075d0.f43223d);
                    Bundle bundle = new Bundle();
                    SnsMethodCalculate.markStartTimeMs("getGalleryMediaItemArrayList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        C87412m.m108593f(next, "path");
                        String str5 = str3;
                        String str6 = str4;
                        GalleryItem$MediaItem galleryItem$VideoMediaItem = C112551y.m153808h(next, ".mp4", false, 2, (Object) null) ? new GalleryItem$VideoMediaItem(0) : new GalleryItem$ImageMediaItem();
                        galleryItem$VideoMediaItem.f162747d = next;
                        if (galleryItem$VideoMediaItem instanceof GalleryItem$VideoMediaItem) {
                            galleryItem$VideoMediaItem.f162755o = MimeTypes.VIDEO_MP4;
                        }
                        arrayList2.add(galleryItem$VideoMediaItem);
                        ArrayList<String> arrayList3 = arrayList;
                        str3 = str5;
                        str4 = str6;
                    }
                    str2 = str3;
                    str = str4;
                    SnsMethodCalculate.markEndTimeMs("getGalleryMediaItemArrayList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    bundle.putParcelableArrayList("media_list", arrayList2);
                    bundle.putString("post_id", snsAlbumPickerUI4.f280772n);
                    bundle.putString("FINDER_CONTEXT_ID", snsAlbumPickerUI4.getIntent().getStringExtra("key_finder_context_id"));
                    bundle.putString("FINDER_SESSION_ID", snsAlbumPickerUI4.getIntent().getStringExtra("key_finder_session_id"));
                    bundle.putString("KEY_ORIGIN_MUSIC_ID", snsAlbumPickerUI4.getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
                    bundle.putString("KEY_ORIGIN_BGM_URL", snsAlbumPickerUI4.getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_BGM_URL"));
                    bundle.putString("KEY_ORIGIN_MUSIC_PATH", snsAlbumPickerUI4.getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH"));
                    bundle.putString("KEY_ORIGIN_MUSIC_NAME", snsAlbumPickerUI4.getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME"));
                    bundle.putByteArray("KEY_ORIGIN_MUSIC_INFO", snsAlbumPickerUI4.getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
                    bundle.putBoolean("KEY_BGM_IF_ORIGIN", snsAlbumPickerUI4.getIntent().getBooleanExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false));
                    bundle.putBoolean("KEY_FULLSCREEN", true);
                    SnsMethodCalculate.markStartTimeMs("getMAX_VIDEO_PLAY_DURATION", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    int intValue = ((Number) ((C36570n) a).getValue()).intValue();
                    SnsMethodCalculate.markEndTimeMs("getMAX_VIDEO_PLAY_DURATION", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    bundle.putLong("video_max_duration", ((long) intValue) * 1000);
                    SnsMethodCalculate.markStartTimeMs("getIMAGE_MAX_WIDTH", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("FinderFeedCompressResolution");
                    if (c == null || c.length() == 0) {
                        i = 1080;
                    } else {
                        C87412m.m108593f(c, "info");
                        i = Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(0));
                    }
                    SnsMethodCalculate.markEndTimeMs("getIMAGE_MAX_WIDTH", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    bundle.putInt("image_max_height", i);
                    SnsMethodCalculate.markStartTimeMs("getIMAGE_MAX_HEIGHT", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    String c2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("FinderFeedCompressResolution");
                    if (c2 == null || c2.length() == 0) {
                        i2 = 1280;
                    } else {
                        C87412m.m108593f(c2, "info");
                        i2 = Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c2).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(1));
                    }
                    SnsMethodCalculate.markEndTimeMs("getIMAGE_MAX_HEIGHT", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    bundle.putInt("image_max_width", i2);
                    SnsMethodCalculate.markStartTimeMs("getIMAGE_COMPRESS_QUALITY", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    String c3 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("FinderFeedCompressPicLevel");
                    if (c3 == null || c3.length() == 0) {
                        i3 = 90;
                    } else {
                        C87412m.m108593f(c3, "info");
                        i3 = Util.safeParseInt(C112550d0.m153799i0(c3).toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("getIMAGE_COMPRESS_QUALITY", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    bundle.putInt("image_compress_quality", i3);
                    bundle.putString("output_dir", C86709a0.m107535s().f251807e + "finderposting/media_tmp/");
                    SnsMethodCalculate.markStartTimeMs("getAlbumProvider", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    UICustomParam.C92617b bVar = new UICustomParam.C92617b();
                    bVar.mo126651e(true);
                    bVar.mo126653g(true);
                    bVar.mo126649c(false);
                    bVar.mo126648b(true);
                    bVar.mo126655i(C0966R.C0969drawable.f4653j6, 0, "", 0);
                    RecordConfigProvider d = RecordConfigProvider.m119434d("", "");
                    d.f272905F = 11;
                    d.f272927o = bVar.f266587a;
                    VideoTransPara c6 = C102609h.Fx0().mo142238c6();
                    d.f272926n = c6;
                    d.f272929q = 3;
                    d.f272935w = c6.f267170h * 1000;
                    bVar.mo126654h(false);
                    SnsMethodCalculate.markStartTimeMs("loadProviderRouter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_use_timeline_editor, true)) {
                        d.mo129804a(4, "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout");
                    } else {
                        d.mo129804a(4, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                    }
                    d.mo129804a(3, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                    d.mo129804a(1, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                    d.mo129804a(0, "com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout");
                    SnsMethodCalculate.markEndTimeMs("loadProviderRouter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markEndTimeMs("getAlbumProvider", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    d.f272912M = bundle;
                    C57353d.f164332a.mo80963a(107, 1, System.currentTimeMillis() - snsAlbumPickerUI4.f280774p, 1, snsAlbumPickerUI4.f280773o);
                    C8532a aVar2 = C8532a.f27585a;
                    AppCompatActivity context = snsAlbumPickerUI4.getContext();
                    SnsMethodCalculate.markStartTimeMs("getEnterTransition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markEndTimeMs("getEnterTransition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markStartTimeMs("getOutTransition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markEndTimeMs("getOutTransition", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markStartTimeMs("getWhere", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    int i5 = z2 ? 3 : 4;
                    SnsMethodCalculate.markEndTimeMs("getWhere", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markStartTimeMs("getBiz", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    SnsMethodCalculate.markEndTimeMs("getBiz", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumVideoEditArgument");
                    aVar2.mo9446e(context, JsApiSetAudioState.CTRL_INDEX, 0, 0, d, i5, 0);
                    SnsMethodCalculate.markEndTimeMs("enterMMRecordVLogUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                }
                SnsMethodCalculate.markEndTimeMs("access$enterMMRecordVLogUI", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                aVar = this;
            } else {
                str2 = str3;
                str = str4;
                SnsAlbumPickerUI snsAlbumPickerUI5 = aVar.f280785a;
                SnsMethodCalculate.markStartTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                boolean z5 = snsAlbumPickerUI5.f280776r;
                SnsMethodCalculate.markEndTimeMs("access$getMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                SnsMethodCalculate.markStartTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                snsAlbumPickerUI5.f280776r = !z5;
                SnsMethodCalculate.markEndTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            }
            if (arrayList.isEmpty()) {
                C76912y0.makeText((Context) aVar.f280785a.getContext(), (int) C0966R.string.jat, 0).show();
            }
            SnsMethodCalculate.markEndTimeMs(str2, str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$b */
    public static final class C96121b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96121b(SnsAlbumPickerUI snsAlbumPickerUI) {
            super(0);
            this.f280786d = snsAlbumPickerUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mAlbumRv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mAlbumRv$2");
            RecyclerView recyclerView = (RecyclerView) this.f280786d.findViewById(C0966R.C0970id.gqc);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mAlbumRv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mAlbumRv$2");
            return recyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$c */
    public static final class C96122c extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96122c(SnsAlbumPickerUI snsAlbumPickerUI) {
            super(0);
            this.f280787d = snsAlbumPickerUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
            Button button = (Button) this.f280787d.findViewById(C0966R.C0970id.hff);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
            return button;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$d */
    public static final class C96123d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C96123d f280788d = new C96123d();

        public C96123d() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSelfName$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSelfName$2");
            String s = C75592q0.m90789s();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSelfName$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSelfName$2");
            return s;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$e */
    public static final class C96124e extends C87413o implements C32224a<C102923d> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96124e(SnsAlbumPickerUI snsAlbumPickerUI) {
            super(0);
            this.f280789d = snsAlbumPickerUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSnsAlbumPickerAdapter$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSnsAlbumPickerAdapter$2");
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280789d;
            int i = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$makeInstanceSnsListPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.getClass();
            SnsMethodCalculate.markStartTimeMs("makeInstanceSnsListPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            AppCompatActivity context = snsAlbumPickerUI.getContext();
            C87412m.m108593f(context, "context");
            C102923d dVar = new C102923d(context);
            dVar.mo142673y5(snsAlbumPickerUI.f280769h);
            SnsMethodCalculate.markStartTimeMs("setMPreloadItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            dVar.f303796s = 4;
            SnsMethodCalculate.markEndTimeMs("setMPreloadItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            SnsMethodCalculate.markEndTimeMs("makeInstanceSnsListPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("access$makeInstanceSnsListPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSnsAlbumPickerAdapter$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mSnsAlbumPickerAdapter$2");
            return dVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$f */
    public static final class C96125f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96125f(SnsAlbumPickerUI snsAlbumPickerUI) {
            super(0);
            this.f280790d = snsAlbumPickerUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mStateDataTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mStateDataTv$2");
            TextView textView = (TextView) this.f280790d.findViewById(C0966R.C0970id.k0w);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mStateDataTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mStateDataTv$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$g */
    public static final class C96126g implements C76440q.C76441a {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280791d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$g$a */
        public static final class C96127a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SnsAlbumPickerUI f280792d;

            /* renamed from: e */
            public final /* synthetic */ C99014h f280793e;

            public C96127a(SnsAlbumPickerUI snsAlbumPickerUI, C99014h hVar) {
                this.f280792d = snsAlbumPickerUI;
                this.f280793e = hVar;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onFpSetSize$1");
                SnsAlbumPickerUI.m123171K7(this.f280792d).mo142648V5(this.f280793e.mo131175t0());
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onFpSetSize$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$g$b */
        public static final class C96128b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SnsAlbumPickerUI f280794d;

            /* renamed from: e */
            public final /* synthetic */ C99014h f280795e;

            public C96128b(SnsAlbumPickerUI snsAlbumPickerUI, C99014h hVar) {
                this.f280794d = snsAlbumPickerUI;
                this.f280795e = hVar;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onNpAddSize$1");
                SnsAlbumPickerUI.m123171K7(this.f280794d).mo142648V5(this.f280795e.mo131175t0());
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onNpAddSize$1");
            }
        }

        public C96126g(SnsAlbumPickerUI snsAlbumPickerUI) {
            this.f280791d = snsAlbumPickerUI;
        }

        /* renamed from: B0 */
        public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
            SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
            C87412m.m108594g(str, "respMinSeq");
            C87412m.m108594g(hVar, "pullSns");
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280791d;
            int i2 = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            int i3 = snsAlbumPickerUI.f280770i;
            SnsMethodCalculate.markEndTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markStartTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.f280770i = i3 + 1;
            SnsMethodCalculate.markEndTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI.m123171K7(this.f280791d).mo142672w5(str);
            String F4 = SnsAlbumPickerUI.m123171K7(this.f280791d).mo142667F4();
            Log.m105924i("MicroMsg.SnsAlbumPickerUI", "onFpSetSize , respMinSeq=" + str + " , currentLimitSeq=" + F4 + " pullSns.isDownAll = " + hVar.mo131175t0());
            C102923d K7 = SnsAlbumPickerUI.m123171K7(this.f280791d);
            String C = hVar.mo131161C();
            if (C == null) {
                C = "";
            }
            K7.mo142670g5(true, C);
            C102923d K72 = SnsAlbumPickerUI.m123171K7(this.f280791d);
            K72.getClass();
            SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            C102948i.C102949a G4 = K72.mo142668G4();
            G4.getClass();
            SnsMethodCalculate.markStartTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            G4.f303832a = str;
            SnsMethodCalculate.markEndTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
            SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            SnsAlbumPickerUI.m123171K7(this.f280791d).mo142647U5();
            if (z || !Util.isNullOrNil(hVar.mo131161C())) {
                SnsAlbumPickerUI.m123171K7(this.f280791d).mo142648V5(true);
            } else {
                if (hVar.mo131174p0() != 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(hVar.mo131174p0()));
                    SnsAlbumPickerUI.m123171K7(this.f280791d).mo142671u5(hVar.mo131174p0());
                }
                SnsAlbumPickerUI.m123169I7(this.f280791d).postDelayed(new C96127a(this.f280791d, hVar), 1000);
                SnsAlbumPickerUI snsAlbumPickerUI2 = this.f280791d;
                SnsMethodCalculate.markStartTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                snsAlbumPickerUI2.f280771j = !hVar.mo131175t0();
                SnsMethodCalculate.markEndTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                if (SnsAlbumPickerUI.m123170J7(this.f280791d) && SnsAlbumPickerUI.m123172L7(this.f280791d)) {
                    SnsAlbumPickerUI.m123168H7(this.f280791d);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        }

        /* renamed from: R6 */
        public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
            SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
            C87412m.m108594g(str, "respMinSeq");
            C87412m.m108594g(hVar, "pullSns");
            MMHandler ly02 = C94866e1.ly0();
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280791d;
            int i2 = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            Runnable runnable = snsAlbumPickerUI.f280783y;
            SnsMethodCalculate.markEndTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            ly02.removeCallbacks(runnable);
            SnsAlbumPickerUI snsAlbumPickerUI2 = this.f280791d;
            SnsMethodCalculate.markStartTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI2.f280766e = false;
            SnsMethodCalculate.markEndTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI3 = this.f280791d;
            SnsMethodCalculate.markStartTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            int i3 = snsAlbumPickerUI3.f280770i;
            SnsMethodCalculate.markEndTimeMs("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markStartTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI3.f280770i = i3 + 1;
            SnsMethodCalculate.markEndTimeMs("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI.m123171K7(this.f280791d).mo142672w5(str);
            C102923d K7 = SnsAlbumPickerUI.m123171K7(this.f280791d);
            String C = hVar.mo131161C();
            if (C == null) {
                C = "";
            }
            K7.mo142670g5(true, C);
            String F4 = SnsAlbumPickerUI.m123171K7(this.f280791d).mo142667F4();
            Log.m105924i("MicroMsg.SnsAlbumPickerUI", "onNpAddSize , respMinSeq=" + str + " , currentLimitSeq=" + F4 + " , isDownAll=" + hVar.mo131175t0());
            if (z) {
                SnsAlbumPickerUI.m123171K7(this.f280791d).mo142648V5(true);
            } else {
                if (hVar.mo131174p0() != 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, Long.valueOf(hVar.mo131174p0()));
                    SnsAlbumPickerUI.m123171K7(this.f280791d).mo142671u5(hVar.mo131174p0());
                }
                SnsAlbumPickerUI.m123169I7(this.f280791d).postDelayed(new C96128b(this.f280791d, hVar), 1000);
                SnsAlbumPickerUI snsAlbumPickerUI4 = this.f280791d;
                SnsMethodCalculate.markStartTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                snsAlbumPickerUI4.f280771j = !hVar.mo131175t0();
                SnsMethodCalculate.markEndTimeMs("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                if (!SnsAlbumPickerUI.m123170J7(this.f280791d) || C87412m.m108589b(str, F4)) {
                    this.f280791d.setBounceEnabled(true);
                    SnsAlbumPickerUI snsAlbumPickerUI5 = this.f280791d;
                    SnsMethodCalculate.markStartTimeMs("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    snsAlbumPickerUI5.getClass();
                    SnsMethodCalculate.markStartTimeMs("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    if (snsAlbumPickerUI5.mo133695P7().getItemCount() > 0) {
                        snsAlbumPickerUI5.mo133692M7().setVisibility(0);
                        snsAlbumPickerUI5.mo133696Q7().setVisibility(8);
                    } else {
                        snsAlbumPickerUI5.mo133692M7().setVisibility(4);
                        snsAlbumPickerUI5.mo133696Q7().setVisibility(0);
                        snsAlbumPickerUI5.mo133696Q7().setText(snsAlbumPickerUI5.getString(C0966R.string.jau));
                        if (!snsAlbumPickerUI5.f280771j) {
                            snsAlbumPickerUI5.mo133696Q7().setText(snsAlbumPickerUI5.getString(C0966R.string.jaw));
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                    SnsMethodCalculate.markEndTimeMs("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                } else {
                    C102923d K72 = SnsAlbumPickerUI.m123171K7(this.f280791d);
                    K72.getClass();
                    SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    C102948i.C102949a G4 = K72.mo142668G4();
                    G4.getClass();
                    SnsMethodCalculate.markStartTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    G4.f303832a = str;
                    SnsMethodCalculate.markEndTimeMs("setMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                    SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
                    SnsAlbumPickerUI.m123171K7(this.f280791d).mo142647U5();
                    if (SnsAlbumPickerUI.m123172L7(this.f280791d)) {
                        SnsAlbumPickerUI.m123168H7(this.f280791d);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        }

        /* renamed from: W0 */
        public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
            SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
            Log.m105918d("MicroMsg.SnsAlbumPickerUI", "onOtherAddSize: respMaxSeq = " + str + ",respMinSeq = " + str2 + ", isOnRecentErr = " + z + " ,recentErrType = " + i + " ,firstPage = " + z2);
            MMHandler ly02 = C94866e1.ly0();
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280791d;
            int i2 = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            Runnable runnable = snsAlbumPickerUI.f280783y;
            SnsMethodCalculate.markEndTimeMs("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            ly02.removeCallbacks(runnable);
            SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        }

        /* renamed from: j2 */
        public void mo96540j2(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$h */
    public static final class C96129h extends C87413o implements C32224a<C102914a> {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96129h(SnsAlbumPickerUI snsAlbumPickerUI) {
            super(0);
            this.f280796d = snsAlbumPickerUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsFileSaveHelper$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsFileSaveHelper$2");
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280796d;
            snsAlbumPickerUI.getClass();
            SnsMethodCalculate.markStartTimeMs("getDownLoadCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            C102914a.C102915a aVar = snsAlbumPickerUI.f280784z;
            SnsMethodCalculate.markEndTimeMs("getDownLoadCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            C102914a aVar2 = new C102914a(aVar);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsFileSaveHelper$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsFileSaveHelper$2");
            return aVar2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$i */
    public static final class C96130i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsAlbumPickerUI f280797d;

        public C96130i(SnsAlbumPickerUI snsAlbumPickerUI) {
            this.f280797d = snsAlbumPickerUI;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$updateAdapterRunnable$1");
            SnsAlbumPickerUI snsAlbumPickerUI = this.f280797d;
            int i = SnsAlbumPickerUI.f280763B;
            SnsMethodCalculate.markStartTimeMs("access$updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.getClass();
            SnsMethodCalculate.markStartTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.mo133695P7().mo142647U5();
            SnsMethodCalculate.markEndTimeMs("updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("access$updateAdapterData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$updateAdapterRunnable$1");
        }
    }

    /* renamed from: H7 */
    public static final void m123168H7(SnsAlbumPickerUI snsAlbumPickerUI) {
        SnsMethodCalculate.markStartTimeMs("access$fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.getClass();
        SnsMethodCalculate.markStartTimeMs("fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.setBounceEnabled(false);
        if (snsAlbumPickerUI.f280766e || !snsAlbumPickerUI.f280771j) {
            SnsMethodCalculate.markEndTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        } else {
            snsAlbumPickerUI.mo133692M7().post(new C102921b0(snsAlbumPickerUI));
            SnsMethodCalculate.markEndTimeMs("showLoadingMoreFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        }
        snsAlbumPickerUI.mo133692M7().postDelayed(new C102958q(snsAlbumPickerUI), 0);
        SnsMethodCalculate.markEndTimeMs("fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("access$fetchNextPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    /* renamed from: I7 */
    public static final /* synthetic */ RecyclerView m123169I7(SnsAlbumPickerUI snsAlbumPickerUI) {
        SnsMethodCalculate.markStartTimeMs("access$getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        RecyclerView M7 = snsAlbumPickerUI.mo133692M7();
        SnsMethodCalculate.markEndTimeMs("access$getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return M7;
    }

    /* renamed from: J7 */
    public static final /* synthetic */ boolean m123170J7(SnsAlbumPickerUI snsAlbumPickerUI) {
        SnsMethodCalculate.markStartTimeMs("access$getMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = snsAlbumPickerUI.f280771j;
        SnsMethodCalculate.markEndTimeMs("access$getMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return z;
    }

    /* renamed from: K7 */
    public static final /* synthetic */ C102923d m123171K7(SnsAlbumPickerUI snsAlbumPickerUI) {
        SnsMethodCalculate.markStartTimeMs("access$getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C102923d P7 = snsAlbumPickerUI.mo133695P7();
        SnsMethodCalculate.markEndTimeMs("access$getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return P7;
    }

    /* renamed from: L7 */
    public static final boolean m123172L7(SnsAlbumPickerUI snsAlbumPickerUI) {
        SnsMethodCalculate.markStartTimeMs("access$isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.getClass();
        SnsMethodCalculate.markStartTimeMs("isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = snsAlbumPickerUI.f280770i <= 2 || snsAlbumPickerUI.mo133695P7().getItemCount() <= 24;
        SnsMethodCalculate.markEndTimeMs("isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("access$isNeedAutoLoopDataFetch", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return z;
    }

    /* renamed from: M7 */
    public final RecyclerView mo133692M7() {
        SnsMethodCalculate.markStartTimeMs("getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Object value = ((C36570n) this.f280777s).getValue();
        C87412m.m108593f(value, "<get-mAlbumRv>(...)");
        RecyclerView recyclerView = (RecyclerView) value;
        SnsMethodCalculate.markEndTimeMs("getMAlbumRv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return recyclerView;
    }

    /* renamed from: N7 */
    public final Button mo133693N7() {
        SnsMethodCalculate.markStartTimeMs("getMNextBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Object value = ((C36570n) this.f280778t).getValue();
        C87412m.m108593f(value, "<get-mNextBtn>(...)");
        Button button = (Button) value;
        SnsMethodCalculate.markEndTimeMs("getMNextBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return button;
    }

    /* renamed from: O7 */
    public final String mo133694O7() {
        SnsMethodCalculate.markStartTimeMs("getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Object value = ((C36570n) this.f280768g).getValue();
        C87412m.m108593f(value, "<get-mSelfName>(...)");
        String str = (String) value;
        SnsMethodCalculate.markEndTimeMs("getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return str;
    }

    /* renamed from: P7 */
    public final C102923d mo133695P7() {
        SnsMethodCalculate.markStartTimeMs("getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C102923d dVar = (C102923d) ((C36570n) this.f280781w).getValue();
        SnsMethodCalculate.markEndTimeMs("getMSnsAlbumPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return dVar;
    }

    /* renamed from: Q7 */
    public final TextView mo133696Q7() {
        SnsMethodCalculate.markStartTimeMs("getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        TextView textView = (TextView) ((C36570n) this.f280779u).getValue();
        SnsMethodCalculate.markEndTimeMs("getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return textView;
    }

    /* renamed from: R7 */
    public final C102914a mo133697R7() {
        SnsMethodCalculate.markStartTimeMs("getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C102914a aVar = (C102914a) ((C36570n) this.f280782x).getValue();
        SnsMethodCalculate.markEndTimeMs("getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return aVar;
    }

    /* renamed from: S7 */
    public final void mo133698S7(List<C102944e0> list) {
        String str;
        SnsMethodCalculate.markStartTimeMs("startDownloadMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C87412m.m108594g(list, "selectItemList");
        String string = getContext().getResources().getString(C0966R.string.jav);
        SnsMethodCalculate.markStartTimeMs("showMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        this.f280780v = C89779i0.m112248e(getContext(), string, true, 3, new C102922c0(this));
        SnsMethodCalculate.markEndTimeMs("showMaterialLoadingDialog", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C102914a R7 = mo133697R7();
        R7.getClass();
        SnsMethodCalculate.markStartTimeMs("downLoadSnsMediaFileList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        R7.mo142636e().clear();
        R7.mo142636e().addAll(list);
        R7.mo142635d().clear();
        R7.f303770e = new LinkedHashMap(R7.mo142636e().size());
        R7.f303767b = true;
        SnsMethodCalculate.markStartTimeMs("getDownLoadManager", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.mo130978c(R7.f303774i);
        SnsMethodCalculate.markEndTimeMs("getDownLoadManager", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        R7.f303771f = Vx0;
        for (C102944e0 next : list) {
            if (next.mo142659b().f298690e == 6) {
                str = C94938q1.m120515b(next.mo142658a().getLocalid(), next.mo142659b());
                if (str == null) {
                    str = "";
                }
            } else {
                str = C94938q1.m120516c(next.mo142659b().f298689d, ".jpg");
            }
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsMediaFileList: destFilePath null, mediaObj id:" + next.mo142659b().f298689d);
            }
            Map<String, String> map = R7.f303770e;
            if (map != null) {
                String str2 = next.mo142659b().f298689d;
                C87412m.m108593f(str2, "info.mediaObj.Id");
                C87412m.m108593f(str, "destFilePath");
                String put = map.put(str2, str);
            }
        }
        C102914a.m136062c(R7, (String) null, 1, (Object) null);
        SnsMethodCalculate.markEndTimeMs("downLoadSnsMediaFileList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        SnsMethodCalculate.markEndTimeMs("startDownloadMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    /* renamed from: T7 */
    public final void mo133699T7(int i) {
        String str;
        SnsMethodCalculate.markStartTimeMs("updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Button N7 = mo133693N7();
        SnsMethodCalculate.markStartTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = false;
        if (1 <= i && i < 10) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        N7.setEnabled(z);
        Button N72 = mo133693N7();
        SnsMethodCalculate.markStartTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (i > 0) {
            str = getContext().getResources().getString(C0966R.string.f360089a13) + '(' + i + ')';
            SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        } else {
            str = getContext().getResources().getString(C0966R.string.f360089a13);
            C87412m.m108593f(str, "context.resources.getStr…ui.R.string.app_nextstep)");
            SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        }
        N72.setText(str);
        SnsMethodCalculate.markEndTimeMs("updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public int getCustomBounceId() {
        SnsMethodCalculate.markStartTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("getCustomBounceId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return C0966R.C0970id.gqc;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        return C0966R.C0971layout.bn5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.Collection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r25, int r26, android.content.Intent r27) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r1 = r27
            java.lang.String r9 = "onActivityResult"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            super.onActivityResult(r25, r26, r27)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            r11 = 0
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            r2[r3] = r1
            java.lang.String r5 = "MicroMsg.SnsAlbumPickerUI"
            java.lang.String r6 = "onActivityResult result=%s request=%s intent=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r2)
            r6 = 8
            r7 = 0
            if (r0 == r6) goto L_0x0259
            r6 = 292(0x124, float:4.09E-43)
            if (r0 == r6) goto L_0x0038
            goto L_0x0346
        L_0x0038:
            com.tencent.mm.plugin.sns.statistics.d r12 = com.tencent.p014mm.plugin.sns.statistics.C57353d.f164332a
            r13 = 107(0x6b, float:1.5E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            java.lang.String r0 = r8.f280773o
            r19 = 12
            r20 = 0
            r18 = r0
            com.tencent.p014mm.plugin.sns.statistics.C57353d.m66092b(r12, r13, r14, r15, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "KSEGMENTMEDIAINFO"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            r7 = r0
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r7 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r7
        L_0x0057:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            java.lang.String r6 = "onMediaGeneratedEnterFinderPostUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r10)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            android.content.Intent r1 = r24.getIntent()
            if (r7 == 0) goto L_0x0253
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            boolean r12 = r8.f280775q
            if (r12 == 0) goto L_0x0076
            r5.putExtras(r1)
        L_0x0076:
            java.lang.String r12 = "ORIGIN_MUSIC_PATH"
            o40.C61926c.m72684i(r5, r0, r12)
            java.lang.String r12 = "ORIGIN_BGM_URL"
            o40.C61926c.m72684i(r5, r0, r12)
            r18 = 0
            r19 = 4
            r20 = 0
            r21 = 0
            r22 = 4
            r23 = 0
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r14 = "MEDIA_IS_MUTE"
            r12 = r5
            r13 = r0
            o40.C61926c.m72679d(r12, r13, r14, r15, r16, r17)
            java.lang.String r14 = "MUSIC_IS_MUTE"
            r15 = r21
            r16 = r22
            r17 = r23
            o40.C61926c.m72679d(r12, r13, r14, r15, r16, r17)
            java.lang.String r14 = "SOUND_TRACK_TYPE"
            r15 = r18
            r16 = r19
            r17 = r20
            o40.C61926c.m72681f(r12, r13, r14, r15, r16, r17)
            java.lang.String r12 = "MUSIC_FEED_ID"
            o40.C61926c.m72684i(r5, r0, r12)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r12 = "MEDIA_EXTRA_MUSIC"
            byte[] r13 = r0.getByteArray(r12)
            if (r13 == 0) goto L_0x00c0
            r5.putExtra(r12, r13)
        L_0x00c0:
            java.lang.String r12 = "ORIGIN_MUSIC_INFO"
            byte[] r13 = r0.getByteArray(r12)
            if (r13 == 0) goto L_0x00cb
            r5.putExtra(r12, r13)
        L_0x00cb:
            java.lang.String r12 = "KEY_POST_HALF_RECT_LIST"
            java.util.ArrayList r13 = r0.getParcelableArrayList(r12)
            if (r13 == 0) goto L_0x00d6
            r5.putExtra(r12, r13)
        L_0x00d6:
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r12 = r7.mo129798a()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r14 = "KEY_IMAGE_QUALITY_INT_ARRAY"
            java.lang.Object r12 = r12.mo129811b(r14, r13)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.List<java.lang.String> r13 = r7.f272899j
            if (r13 == 0) goto L_0x00f4
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r4
            if (r4 != r13) goto L_0x00f4
            r13 = 1
            goto L_0x00f5
        L_0x00f4:
            r13 = 0
        L_0x00f5:
            java.lang.String r14 = "key_post_media_quality_list"
            java.lang.String r15 = "postThumbList"
            java.lang.String r2 = "postTypeList"
            java.lang.String r11 = "postMediaList"
            java.lang.String r4 = "postType"
            if (r13 == 0) goto L_0x017f
            r5.putExtra(r4, r3)
            java.util.List<java.lang.String> r4 = r7.f272899j
            java.lang.String r13 = "model.multiImagePath"
            gy3.C87412m.m108593f(r4, r13)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x011a:
            boolean r19 = r4.hasNext()
            if (r19 == 0) goto L_0x0130
            java.lang.Object r19 = r4.next()
            r25 = r4
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            r3.add(r4)
            r4 = r25
            goto L_0x011a
        L_0x0130:
            r5.putExtra(r11, r3)
            java.util.List<java.lang.String> r3 = r7.f272899j
            gy3.C87412m.m108593f(r3, r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0141:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x0156
            java.lang.Object r11 = r3.next()
            java.lang.String r11 = (java.lang.String) r11
            r11 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r4.add(r13)
            goto L_0x0141
        L_0x0156:
            r5.putExtra(r2, r4)
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r7.f272895f
            r4 = 0
            r2[r4] = r3
            java.util.ArrayList r2 = sx3.C64197v.m75534c(r2)
            r5.putExtra(r15, r2)
            if (r12 == 0) goto L_0x0179
            int r2 = r12.size()
            java.util.List<java.lang.String> r3 = r7.f272899j
            int r3 = r3.size()
            if (r2 != r3) goto L_0x0179
            r5.putExtra(r14, r12)
        L_0x0179:
            java.lang.String r2 = "KEY_POST_HALF_IMAGE_LIST"
            o40.C61926c.m72683h(r5, r0, r2)
            goto L_0x01c9
        L_0x017f:
            r3 = 4
            r5.putExtra(r4, r3)
            r4 = 1
            java.lang.String[] r13 = new java.lang.String[r4]
            java.lang.String r3 = r7.f272894e
            r16 = 0
            r13[r16] = r3
            java.util.ArrayList r3 = sx3.C64197v.m75534c(r13)
            r5.putExtra(r11, r3)
            java.lang.Integer[] r3 = new java.lang.Integer[r4]
            r11 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r16] = r11
            java.util.ArrayList r3 = sx3.C64197v.m75534c(r3)
            r5.putExtra(r2, r3)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r3 = r7.f272895f
            r2[r16] = r3
            java.util.ArrayList r2 = sx3.C64197v.m75534c(r2)
            r5.putExtra(r15, r2)
            if (r12 == 0) goto L_0x01bb
            int r2 = r12.size()
            if (r2 != r4) goto L_0x01bb
            r5.putExtra(r14, r12)
        L_0x01bb:
            if (r0 == 0) goto L_0x01c9
            java.lang.String r2 = "video_composition"
            byte[] r0 = r0.getByteArray(r2)
            if (r0 == 0) goto L_0x01c9
            r5.putExtra(r2, r0)
        L_0x01c9:
            java.lang.String r0 = r8.f280772n
            java.lang.String r2 = "post_id"
            r5.putExtra(r2, r0)
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r0 = r7.mo129798a()
            java.lang.String r2 = "KEY_MULTI_MEDIA_EDIT_ID_STRING"
            java.lang.String r3 = ""
            java.lang.Object r0 = r0.mo129811b(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "edit_id"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "key_finder_post_from"
            r2 = -1
            int r1 = r1.getIntExtra(r0, r2)
            r5.putExtra(r0, r1)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r0)
            java.lang.String r0 = "com.tencent.mm.plugin.finder.ui.FinderPostUI"
            r5.setClassName(r8, r0)
            com.tencent.mm.plugin.sns.statistics.d r17 = com.tencent.p014mm.plugin.sns.statistics.C57353d.f164332a
            r18 = 107(0x6b, float:1.5E-43)
            r19 = 1
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.f280774p
            long r20 = r0 - r2
            r22 = 1
            java.lang.String r0 = r8.f280773o
            r23 = r0
            r17.mo80963a(r18, r19, r20, r22, r23)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r5)
            java.lang.Object[] r1 = r11.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI"
            java.lang.String r3 = "onMediaGeneratedEnterFinderPostUI"
            java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$CaptureVideoNormalModel;Landroid/os/Bundle;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r0 = r24
            r13 = r6
            r6 = r7
            r7 = r12
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r11.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI"
            java.lang.String r2 = "onMediaGeneratedEnterFinderPostUI"
            java.lang.String r3 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/recordvideo/jumper/CaptureDataManager$CaptureVideoNormalModel;Landroid/os/Bundle;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r24
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r24.finish()
            goto L_0x0254
        L_0x0253:
            r13 = r6
        L_0x0254:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
            goto L_0x0346
        L_0x0259:
            if (r1 == 0) goto L_0x0262
            java.lang.String r0 = "sns_album_select_mediaobj_id_list"
            java.util.ArrayList r7 = r1.getStringArrayListExtra(r0)
        L_0x0262:
            if (r7 != 0) goto L_0x0269
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0269:
            boolean r0 = r7.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0346
            yu2.d r0 = r24.mo133695P7()
            r0.getClass()
            java.lang.String r1 = "getSelectedItemListByMediaId"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L_0x028e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x02bf
        L_0x028e:
            java.util.Iterator r4 = r7.iterator()
        L_0x0292:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02bc
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "getMObjIdMediaInfoMap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
            rx3.g r7 = r0.f303789i
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.util.Map r7 = (java.util.Map) r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            java.lang.Object r5 = r7.get(r5)
            yu2.e0 r5 = (yu2.C102944e0) r5
            if (r5 == 0) goto L_0x0292
            r3.add(r5)
            goto L_0x0292
        L_0x02bc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x02bf:
            r8.mo133698S7(r3)
            yu2.d r0 = r24.mo133695P7()
            r0.getClass()
            java.lang.String r1 = "updateSelectedState"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.List r5 = r0.mo142645S5()
            java.util.Iterator r5 = r5.iterator()
        L_0x02dc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02f7
            java.lang.Object r6 = r5.next()
            yu2.e0 r6 = (yu2.C102944e0) r6
            int r6 = r0.mo142643Q5(r6)
            r7 = -1
            if (r6 == r7) goto L_0x02dc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.add(r6)
            goto L_0x02dc
        L_0x02f7:
            java.util.Iterator r5 = r3.iterator()
        L_0x02fb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0316
            java.lang.Object r6 = r5.next()
            yu2.e0 r6 = (yu2.C102944e0) r6
            int r6 = r0.mo142643Q5(r6)
            r7 = -1
            if (r6 == r7) goto L_0x02fb
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.add(r6)
            goto L_0x02fb
        L_0x0316:
            java.util.List r5 = r0.mo142645S5()
            r5.clear()
            java.util.List r5 = r0.mo142645S5()
            r5.addAll(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x0328:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x033c
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r0.notifyItemChanged(r5)
            goto L_0x0328
        L_0x033c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            int r0 = r3.size()
            r8.mo133699T7(r0)
        L_0x0346:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C57353d.f164332a.mo80963a(107, 1, System.currentTimeMillis() - this.f280774p, 0, this.f280773o);
        super.onBackPressed();
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("handleIntent", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        String stringExtra = getIntent().getStringExtra("key_finder_post_id");
        if (stringExtra == null) {
            stringExtra = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        }
        this.f280772n = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("key_finder_context_id");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f280773o = stringExtra2;
        this.f280775q = getIntent().getBooleanExtra("album_from_finder_add_media", false);
        String stringExtra3 = getIntent().getStringExtra("sns_userName");
        if (stringExtra3 == null) {
            stringExtra3 = mo133694O7();
        }
        this.f280769h = stringExtra3;
        SnsMethodCalculate.markEndTimeMs("handleIntent", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        setMMTitle(getContext().getResources().getString(C0966R.string.jay));
        setBackBtn(new C102959r(this), C0966R.C0969drawable.f4388b6);
        setActionbarColor(getResources().getColor(C0966R.color.f3496v_));
        showActionbarLine();
        SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initSnsAlbumNavigationBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        setNavigationbarColor(getResources().getColor(C0966R.color.f3496v_));
        SnsMethodCalculate.markEndTimeMs("initSnsAlbumNavigationBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initSnsAlbumRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C5431p1.C5432a aVar = this.f280767f;
        if (aVar == null) {
            aVar = C94866e1.dy0();
        }
        this.f280767f = aVar;
        RecyclerView M7 = mo133692M7();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.f44666B = new C102965y(this);
        M7.setLayoutManager(gridLayoutManager);
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        Resources resources = context.getResources();
        C87412m.m108593f(resources, "mContext.resources");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SnsMethodCalculate.markStartTimeMs("setHorizontalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        int dimensionPixelSize = resources.getDimensionPixelSize(C0966R.dimen.ao9);
        SnsMethodCalculate.markEndTimeMs("setHorizontalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markStartTimeMs("setVerticalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0966R.dimen.ao9);
        SnsMethodCalculate.markEndTimeMs("setVerticalSpan", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markStartTimeMs("setShowLastLine", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markEndTimeMs("setShowLastLine", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markStartTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        linkedHashSet.add(2);
        SnsMethodCalculate.markEndTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markStartTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        linkedHashSet.add(4);
        SnsMethodCalculate.markEndTimeMs("addIgnoreItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        C16074c cVar = new C16074c(dimensionPixelSize, dimensionPixelSize2, -16777216, false, linkedHashSet);
        SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration$Builder");
        mo133692M7().mo17085h0(cVar);
        mo133692M7().mo17043c(new C102966z(this));
        mo133692M7().postDelayed(new C102919a0(this), 0);
        SnsMethodCalculate.markEndTimeMs("initSnsAlbumRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        mo133695P7().mo142673y5(this.f280769h);
        C102923d P7 = mo133695P7();
        C102960s sVar = new C102960s(this);
        P7.getClass();
        SnsMethodCalculate.markStartTimeMs("setMOnPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        P7.f303794q = sVar;
        SnsMethodCalculate.markEndTimeMs("setMOnPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d P72 = mo133695P7();
        C102961t tVar = new C102961t(this);
        P72.getClass();
        SnsMethodCalculate.markStartTimeMs("setMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        P72.f303791n = tVar;
        SnsMethodCalculate.markEndTimeMs("setMLoadDataFinishCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d P73 = mo133695P7();
        C102962u uVar = new C102962u(this);
        P73.getClass();
        SnsMethodCalculate.markStartTimeMs("setMOnSelectItemChangedCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        P73.f303792o = uVar;
        SnsMethodCalculate.markEndTimeMs("setMOnSelectItemChangedCallback", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d P74 = mo133695P7();
        C102963v vVar = new C102963v(this);
        P74.getClass();
        SnsMethodCalculate.markStartTimeMs("setMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        P74.f303793p = vVar;
        SnsMethodCalculate.markEndTimeMs("setMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d P75 = mo133695P7();
        C66702w wVar = new C66702w(this);
        P75.getClass();
        SnsMethodCalculate.markStartTimeMs("setMOnShowLoadingFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        P75.f303795r = wVar;
        SnsMethodCalculate.markEndTimeMs("setMOnShowLoadingFooter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        mo133692M7().setAdapter(mo133695P7());
        SnsMethodCalculate.markEndTimeMs("initPickerAdapter", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("initSnsAlbumNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Button N7 = mo133693N7();
        C102923d P76 = mo133695P7();
        P76.getClass();
        SnsMethodCalculate.markStartTimeMs("getSelectedCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int size = P76.mo142645S5().size();
        SnsMethodCalculate.markEndTimeMs("getSelectedCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markStartTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = true;
        if (1 > size || size >= 10) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isNextButtonEnable", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        N7.setEnabled(z);
        mo133693N7().setOnClickListener(new C102964x(this));
        SnsMethodCalculate.markEndTimeMs("initSnsAlbumNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markStartTimeMs("checkNetworkState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (!NetStatusUtil.isConnected((Context) getContext())) {
            C76912y0.makeText((Context) getContext(), (int) C0966R.string.f360087a11, 0).show();
        }
        SnsMethodCalculate.markEndTimeMs("checkNetworkState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C57353d.m66092b(C57353d.f164332a, 107, 0, 0, 0, this.f280773o, 12, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public void onDestroy() {
        C5431p1.C5432a aVar;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.onDestroy();
        this.f280765d = true;
        C94866e1.dy0().mo6411b(this.f280769h);
        C94866e1.ly0().removeCallbacks(this.f280783y);
        if (C86709a0.m107523b().mo121114l() && (aVar = this.f280767f) != null) {
            C96126g gVar = this.f280764A;
            SnsMethodCalculate.markStartTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            aVar.mo6412c(gVar, 2);
        }
        mo133697R7().mo142637f();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        super.onResume();
        this.f280774p = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
    }
}
