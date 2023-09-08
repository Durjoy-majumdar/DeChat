package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import ai2.C92007a;
import ai2.C92011d;
import ai2.C92013g;
import ai2.C92015i;
import ai2.C92021o;
import ai2.C92024r;
import ai2.C92026t;
import ai2.C92027u;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryQuitPublishStruct;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo.EditorVideoPlayView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import fh2.C97882i;
import gy3.C87412m;
import h90.C98324b;
import hi2.C98452d;
import hi2.C98464o;
import i21.C60242i;
import i72.C98609j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import jh2.C108745d;
import k21.C60960c;
import kotlin.Metadata;
import lh2.C109339f0;
import lh2.C99418b0;
import lh2.C99428e0;
import lh2.C99431f1;
import mh2.C99896a;
import o40.C61926c;
import p206nj.C100115c;
import pe3.C47465a;
import qh2.C101198e;
import te3.C101807lr2;
import th2.C101891f;
import th2.C110992d;
import wg2.C102440a;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lqh2/e;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew */
public class EditorVideoPluginLayoutNew extends BaseEditVideoPluginLayout {

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew$a */
    public /* synthetic */ class C94409a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f272976a;

        static {
            int[] iArr = new int[C101198e.C101199b.values().length];
            iArr[62] = 1;
            f272976a = iArr;
            int[] iArr2 = new int[C92011d.values().length];
            iArr2[1] = 1;
            iArr2[0] = 2;
            iArr2[2] = 3;
            iArr2[4] = 4;
            iArr2[3] = 5;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew$b */
    public static final class C94410b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorVideoPluginLayoutNew f272977d;

        public C94410b(EditorVideoPluginLayoutNew editorVideoPluginLayoutNew) {
            this.f272977d = editorVideoPluginLayoutNew;
        }

        public final void run() {
            C98324b captureInfo = this.f272977d.getCaptureInfo();
            String str = null;
            C86013q1.m106447h(captureInfo != null ? captureInfo.f288185f : null);
            C98324b captureInfo2 = this.f272977d.getCaptureInfo();
            if (captureInfo2 != null) {
                str = captureInfo2.f288180a;
            }
            C86013q1.m106447h(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorVideoPluginLayoutNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        long j;
        if (!super.mo78564e()) {
            Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "onBackPress");
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_AFTER_EDIT_INT", 0);
            dVar.mo162672f();
            Iterator<T> it = getItemContainerPlugin().f291592d.getAllItemViews().iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                j = 1;
                if (!it.hasNext()) {
                    break;
                }
                C92015i iVar = (C92015i) it.next();
                if (iVar instanceof C92013g) {
                    i++;
                } else if (iVar instanceof C92026t) {
                    i2++;
                } else if (iVar instanceof C92024r) {
                    C110992d.f332431g.f310324n = 1;
                } else if (!(iVar instanceof C92021o) && (iVar instanceof C92027u)) {
                    C110992d.f332431g.f310331u = 1;
                }
            }
            StoryQuitPublishStruct storyQuitPublishStruct = C110992d.f332431g;
            if (!getMoreMenuPlugin().f224407j) {
                j = 0;
            }
            storyQuitPublishStruct.f310328r = j;
            StoryQuitPublishStruct storyQuitPublishStruct2 = C110992d.f332431g;
            storyQuitPublishStruct2.f310321k = (long) i;
            storyQuitPublishStruct2.f310322l = (long) i2;
            C98324b captureInfo = getCaptureInfo();
            if (captureInfo != null && captureInfo.f288182c) {
                ((C119157j) C119157j.f356862d).mo183875f(new C94410b(this));
            }
            getPreviewPlugin().reset();
            C102440a navigator = getNavigator();
            if (navigator != null) {
                C102440a.C102441a.m135179a(navigator, 0, (C98324b) null, 2, (Object) null);
            }
        }
        return true;
    }

    public View getPlayerView() {
        EditorVideoPlayView editorVideoPlayView = new EditorVideoPlayView(getContext());
        Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "playerView :" + editorVideoPlayView);
        setPreviewPlugin(new C109339f0(editorVideoPlayView, this, (TextView) findViewById(C0966R.C0970id.l5_)));
        getPluginList().add(getPreviewPlugin());
        return editorVideoPlayView;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        int i;
        C96814a.C96817e eVar;
        Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "loadCurrentPage info " + bVar);
        super.mo129855l(bVar);
        if (bVar != null) {
            C98452d.f288773c = 0;
            boolean z = true;
            if (bVar.mo137611a()) {
                C98452d.f288773c++;
            }
            if (bVar.mo137612b()) {
                C98452d.f288773c++;
            }
            long currentTicks = Util.currentTicks();
            C99418b0 bgPlugin = getBgPlugin();
            C98324b captureInfo = getCaptureInfo();
            C87412m.m108591d(captureInfo);
            bgPlugin.mo138858a(captureInfo, getConfigProvider());
            C109339f0 previewPlugin = getPreviewPlugin();
            C98324b captureInfo2 = getCaptureInfo();
            C87412m.m108591d(captureInfo2);
            RecordConfigProvider configProvider = getConfigProvider();
            previewPlugin.getClass();
            Log.m105924i("MicroMsg.EditVideoPlayPlugin", "start preview " + captureInfo2);
            previewPlugin.f327327i = captureInfo2;
            previewPlugin.f327328j = configProvider != null ? configProvider.f272935w : 10000;
            VideoPlayerTextureView videoPlayerTextureView = previewPlugin.f327322d;
            C100115c cVar = new C100115c(videoPlayerTextureView != null ? videoPlayerTextureView.getContext() : null);
            previewPlugin.f327324f = cVar;
            cVar.mo139415b();
            VideoPlayerTextureView videoPlayerTextureView2 = previewPlugin.f327322d;
            if (videoPlayerTextureView2 != null) {
                videoPlayerTextureView2.setVisibility(0);
            }
            VideoPlayerTextureView videoPlayerTextureView3 = previewPlugin.f327322d;
            if (videoPlayerTextureView3 != null) {
                videoPlayerTextureView3.setAlpha(0.0f);
            }
            VideoPlayerTextureView videoPlayerTextureView4 = previewPlugin.f327322d;
            if (videoPlayerTextureView4 != null) {
                videoPlayerTextureView4.setVideoPath(captureInfo2.mo137615e());
            }
            if (configProvider != null ? C87412m.m108589b(configProvider.f272930r, Boolean.TRUE) : false) {
                C96814a.C96817e eVar2 = C96814a.C96817e.DEFAULT;
                C98464o.C98465a a = C98464o.f288797a.mo137832a(captureInfo2.mo137615e());
                if (a != null) {
                    boolean z2 = (i = a.f288801d) == 0 || i == 180 ? a.f288798a > a.f288799b : a.f288799b > a.f288798a;
                    if (configProvider != null && (eVar = configProvider.f272928p) != eVar2) {
                        VideoPlayerTextureView videoPlayerTextureView5 = previewPlugin.f327322d;
                        if (videoPlayerTextureView5 != null) {
                            videoPlayerTextureView5.setScaleType(eVar);
                        }
                    } else if (z2) {
                        VideoPlayerTextureView videoPlayerTextureView6 = previewPlugin.f327322d;
                        if (videoPlayerTextureView6 != null) {
                            videoPlayerTextureView6.setScaleType(eVar2);
                        }
                    } else {
                        VideoPlayerTextureView videoPlayerTextureView7 = previewPlugin.f327322d;
                        if (videoPlayerTextureView7 != null) {
                            videoPlayerTextureView7.setForceScaleFullScreen(true);
                        }
                        VideoPlayerTextureView videoPlayerTextureView8 = previewPlugin.f327322d;
                        if (videoPlayerTextureView8 != null) {
                            videoPlayerTextureView8.setScaleType(C96814a.C96817e.COVER);
                        }
                    }
                    previewPlugin.f327332q = true;
                }
            }
            VideoPlayerTextureView videoPlayerTextureView9 = previewPlugin.f327322d;
            if (videoPlayerTextureView9 != null) {
                videoPlayerTextureView9.setVideoCallback(previewPlugin.f327334s);
            }
            previewPlugin.f327330o = captureInfo2.f288183d;
            previewPlugin.f327331p = captureInfo2.f288184e;
            TextView textView = previewPlugin.f327323e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = previewPlugin.f327323e;
            if (textView2 != null && WeChatEnvironment.hasDebugger()) {
                C98609j.f289118a.postToWorker(new C99428e0(previewPlugin, textView2));
            }
            Log.m105918d("MicroMsg.EditorVideoPluginLayoutNew", "previewPlugin " + Util.ticksToNow(currentTicks));
            C99431f1 reMuxPlugin = getReMuxPlugin();
            RecordConfigProvider configProvider2 = getConfigProvider();
            C87412m.m108591d(configProvider2);
            reMuxPlugin.mo138876k(bVar, configProvider2);
            Log.m105918d("MicroMsg.EditorVideoPluginLayoutNew", "reMuxPlugin " + Util.ticksToNow(currentTicks));
            C99896a cropVideoPlugin = getCropVideoPlugin();
            C98324b captureInfo3 = getCaptureInfo();
            C87412m.m108591d(captureInfo3);
            RecordConfigProvider configProvider3 = getConfigProvider();
            C87412m.m108591d(configProvider3);
            cropVideoPlugin.getClass();
            cropVideoPlugin.f292727o = captureInfo3;
            cropVideoPlugin.f292728p = configProvider3;
            Log.m105918d("MicroMsg.EditorVideoPluginLayoutNew", "cropVideoPlugin " + Util.ticksToNow(currentTicks));
            Bundle bundle = bVar.f288193n;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("AUDIO_CACHE_INFO_LIST_KEY");
                Bundle bundle2 = bVar.f288193n;
                C87412m.m108591d(bundle2);
                int i2 = bundle2.getInt("AUDIO_CACHE_INFO_INDEX_KEY", 0);
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    getAddMusicPlugin().mo161618a(i2, parcelableArrayList);
                }
            }
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_MEDIA_TYPE_INT", 2);
            dVar.mo162677k("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", Integer.valueOf(bVar.f288184e));
            dVar.mo162677k("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            dVar.mo162677k("KEY_EDIT_PUBLISHID_INT", Long.valueOf(System.currentTimeMillis()));
            C110992d.f332428d.f310295h = System.currentTimeMillis();
            StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
            ArrayList<String> arrayList = bVar.f288190k;
            long j = 1;
            storyDoPublishStruct.f310312y = !(arrayList == null || arrayList.isEmpty()) ? 1 : 2;
            C110992d.f332428d.f310313z = (long) bVar.f288190k.size();
            StoryQuitPublishStruct storyQuitPublishStruct = C110992d.f332431g;
            ArrayList<String> arrayList2 = bVar.f288190k;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z = false;
            }
            if (z) {
                j = 2;
            }
            storyQuitPublishStruct.f310329s = j;
            C110992d.f332431g.f310330t = (long) bVar.f288190k.size();
            if (bVar.f288182c) {
                C101891f fVar = C101891f.f300035a;
                fVar.mo141384r(bVar.f288180a);
                fVar.mo141385s(bVar.f288185f);
            } else {
                C101891f.f300035a.mo141380n(bVar.f288180a);
            }
            C101891f.f300035a.mo141373g(getConfigProvider());
            C98324b captureInfo4 = getCaptureInfo();
            C87412m.m108591d(captureInfo4);
            if (!captureInfo4.f288182c) {
                RecordConfigProvider configProvider4 = getConfigProvider();
                if ((configProvider4 != null ? configProvider4.f272905F : 0) > 0) {
                    dVar.mo162677k("KEY_MEDIA_SOURCE_INT", 0);
                }
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        C110992d.f332425a.mo162668a("MEDIA_EDIT_PAGE_STAYTIME_LONG", getBrowserTimeMs());
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaEditPageStaytime_", Long.valueOf(getBrowserTimeMs()), C60242i.APPEND);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        int i;
        long j;
        ArrayList<String> arrayList;
        C101198e.C101199b bVar2 = bVar;
        C87412m.m108594g(bVar2, "status");
        C101198e.C101199b bVar3 = C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT;
        if (bVar2 != bVar3) {
            Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "statusChange " + bVar2 + " ,param : " + bundle);
        } else {
            Bundle bundle2 = bundle;
        }
        if (C94409a.f272976a[bVar.ordinal()] == 1) {
            String b = getBgPlugin().mo138859b();
            getPreviewPlugin().release();
            getItemContainerPlugin().onPause();
            getAddMusicPlugin().onPause();
            int i2 = 0;
            if (getMoreMenuPlugin().f224407j) {
                Pattern pattern = C61926c.f176038a;
                i = 1;
            } else {
                i = 0;
            }
            CaptureDataManager.f272890c.f272892b.putInt("key_extra_feature_flag", i);
            if (getMoreMenuPlugin().f224408n == 2) {
                CaptureDataManager.f272890c.f272892b.putString("key_group_list", getMoreMenuPlugin().mo106974a());
            } else if (getMoreMenuPlugin().f224408n == 3) {
                CaptureDataManager.f272890c.f272892b.putString("key_black_list", getMoreMenuPlugin().mo106974a());
            }
            C97882i iVar = new C97882i(getAddMusicPlugin().mo161620c(), getAddMusicPlugin().f329710j, getItemContainerPlugin().mo138890d((Matrix) null), getItemContainerPlugin().mo138889c(), getItemContainerPlugin().mo138888b(), getPreviewPlugin().f327330o, getPreviewPlugin().f327331p, new ArrayList(), b, getItemContainerPlugin().mo138893h());
            Log.m105924i("MicroMsg.EditorVideoPluginLayoutNew", "edit config: " + iVar);
            C101891f fVar = C101891f.f300035a;
            int[] iArr = new int[3];
            iArr[0] = getItemContainerPlugin().mo138891f();
            iArr[1] = getItemContainerPlugin().mo138892g();
            iArr[2] = getAddMusicPlugin().f329710j == null ? 0 : 1;
            fVar.mo141374h(iArr);
            getReMuxPlugin().mo138878m(iVar);
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138891f()));
            dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138892g()));
            dVar.mo162677k("KEY_SELECT_MUSIC_INT", Integer.valueOf(getAddMusicPlugin().f329710j == null ? 0 : 1));
            dVar.mo162677k("KEY_SELECT_ORIGIN_INT", Integer.valueOf(getAddMusicPlugin().mo161620c() ^ true ? 1 : 0));
            dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
            Iterator<C92007a> it = getItemContainerPlugin().mo138889c().iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                j = 1;
                if (!it.hasNext()) {
                    break;
                }
                C92007a next = it.next();
                int ordinal = next.f263402a.ordinal();
                if (ordinal == 0) {
                    i4++;
                } else if (ordinal == 1) {
                    i3++;
                } else if (ordinal == 2) {
                    C47465a protoBuf = next.toProtoBuf();
                    C87412m.m108592e(protoBuf, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LocationItemData");
                    C101807lr2 lr22 = (C101807lr2) protoBuf;
                    StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
                    String str = lr22.f298721d;
                    C87412m.m108593f(str, "poiData.cityName");
                    String str2 = lr22.f298722e;
                    C87412m.m108593f(str2, "poiData.poiName");
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(C112551y.m153814n(str, ",", " ", true));
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        if (sb.length() > 0) {
                            sb.append("|");
                        }
                        sb.append(C112551y.m153814n(str2, ",", " ", true));
                    }
                    String sb4 = sb.toString();
                    C87412m.m108593f(sb4, "reportPositionString.toString()");
                    storyDoPublishStruct.f310303p = storyDoPublishStruct.mo86045b("PositionInfo", sb4, true);
                    StoryDoPublishStruct storyDoPublishStruct2 = C110992d.f332428d;
                    storyDoPublishStruct2.f310305r = storyDoPublishStruct2.mo86045b("PositionLatitude", String.valueOf(lr22.f298725h), true);
                    StoryDoPublishStruct storyDoPublishStruct3 = C110992d.f332428d;
                    storyDoPublishStruct3.f310306s = storyDoPublishStruct3.mo86045b("PositionLongitude", String.valueOf(lr22.f298724g), true);
                } else if (ordinal == 3) {
                    C110992d.f332428d.f310288B = 1;
                } else if (ordinal == 4) {
                    C110992d.f332428d.f310287A = 1;
                }
            }
            StoryDoPublishStruct storyDoPublishStruct4 = C110992d.f332428d;
            storyDoPublishStruct4.f310299l = (long) i3;
            storyDoPublishStruct4.f310300m = (long) i4;
            if (!getMoreMenuPlugin().f224407j) {
                j = 0;
            }
            storyDoPublishStruct4.f310311x = j;
            StringBuilder sb5 = new StringBuilder();
            C98324b captureInfo = getCaptureInfo();
            if (!(captureInfo == null || (arrayList = captureInfo.f288190k) == null)) {
                for (String decodeFile : arrayList) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(decodeFile, options);
                    int i5 = options.outWidth;
                    int i6 = options.outHeight;
                    sb5.append(i6 + XVFSFile.PATH_SEPARATOR_CHAR + i5 + "||");
                }
            }
            int lastIndexOf = sb5.lastIndexOf("||");
            if (lastIndexOf >= 0) {
                StoryDoPublishStruct storyDoPublishStruct5 = C110992d.f332428d;
                storyDoPublishStruct5.f310289C = storyDoPublishStruct5.mo86045b("PhotoWidthHeightScales", sb5.substring(0, lastIndexOf).toString(), true);
            }
            C110992d dVar2 = C110992d.f332425a;
            dVar2.mo162670d(13);
            C110992d.f332428d.f310296i = System.currentTimeMillis();
            RecordConfigProvider configProvider = getConfigProvider();
            if (configProvider != null) {
                i2 = configProvider.f272905F;
            }
            dVar2.mo162671e(i2);
            dVar2.mo162672f();
            C108745d dVar3 = C108745d.f325633i;
            if (dVar3 != null) {
                dVar3.mo159768d();
                return;
            }
            return;
        }
        if (bVar2 != bVar3) {
            Log.m105920e("MicroMsg.EditorVideoPluginLayoutNew", "unknown status " + bVar2);
        }
        super.mo14585p(bVar, bundle);
    }
}
