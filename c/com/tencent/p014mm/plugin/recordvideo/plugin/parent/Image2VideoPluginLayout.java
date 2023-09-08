package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import ai2.C92007a;
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
import bi2.C92262a;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryQuitPublishStruct;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.StoryFakeVideoPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.file.XVFSFile;
import fh2.C97882i;
import gy3.C8480h;
import gy3.C87412m;
import h90.C98324b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import lh2.C109382z;
import lh2.C99431f1;
import o40.C61926c;
import pe3.C47465a;
import qh2.C101198e;
import te3.C101807lr2;
import th2.C110992d;
import wg2.C102440a;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/Image2VideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lqh2/e;", "Landroid/view/View;", "getPlayerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.Image2VideoPluginLayout */
public final class Image2VideoPluginLayout extends BaseEditVideoPluginLayout {

    /* renamed from: E */
    public C109382z f272978E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Image2VideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        long j;
        if (super.mo78564e()) {
            return true;
        }
        Log.m105924i("MicroMsg.Image2VideoPluginLayout", "onBackPress");
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
        C102440a navigator = getNavigator();
        if (navigator == null) {
            return true;
        }
        C102440a.C102441a.m135179a(navigator, 0, (C98324b) null, 2, (Object) null);
        return true;
    }

    public View getPlayerView() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        StoryFakeVideoPlayView storyFakeVideoPlayView = new StoryFakeVideoPlayView(context);
        storyFakeVideoPlayView.setAlpha(0.0f);
        Log.m105924i("MicroMsg.Image2VideoPluginLayout", "playerView :" + storyFakeVideoPlayView);
        C109382z zVar = new C109382z(storyFakeVideoPlayView, this);
        this.f272978E = zVar;
        getPluginList().add(zVar);
        return storyFakeVideoPlayView;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        int size;
        super.mo129855l(bVar);
        Log.m105924i("MicroMsg.Image2VideoPluginLayout", "loadCurrentPage info " + bVar);
        if (bVar != null) {
            C109382z zVar = this.f272978E;
            if (zVar != null) {
                Log.m105924i("MicroMsg.EditPhotoToVideoPlugin", "start preview " + bVar);
                zVar.f327456e = bVar;
                boolean z = false;
                zVar.f327455d.setVisibility(0);
                zVar.f327455d.setAlpha(0.0f);
                zVar.f327455d.setCallback(zVar.f327457f);
                StoryFakeVideoPlayView storyFakeVideoPlayView = zVar.f327455d;
                ArrayList<String> arrayList = bVar.f288190k;
                storyFakeVideoPlayView.getClass();
                C87412m.m108594g(arrayList, "imageList");
                Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", AssetExtension.SCENE_PLAY);
                StoryFakeVideoPlayView.C106051c cVar = storyFakeVideoPlayView.f315676j;
                if (cVar != null) {
                    List<String> list = storyFakeVideoPlayView.f315677n;
                    if (list != null && list.size() == arrayList.size() && (size = arrayList.size() - 1) >= 0) {
                        int i = 0;
                        while (true) {
                            if (Util.isEqual(arrayList.get(i), list.get(i))) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (!z || cVar.f315683e) {
                        cVar.f315683e = true;
                    } else {
                        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "play same imagelist, do nothing");
                    }
                }
                storyFakeVideoPlayView.f315677n = arrayList;
                StoryFakeVideoPlayView.C106051c cVar2 = new StoryFakeVideoPlayView.C106051c(storyFakeVideoPlayView, arrayList);
                storyFakeVideoPlayView.f315676j = cVar2;
                ((C119157j) C119157j.f356862d).mo183884o(cVar2);
            }
            C99431f1 reMuxPlugin = getReMuxPlugin();
            RecordConfigProvider configProvider = getConfigProvider();
            C87412m.m108591d(configProvider);
            reMuxPlugin.mo138876k(bVar, configProvider);
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        int i;
        ArrayList<String> arrayList;
        long j;
        ArrayList<String> arrayList2;
        C98324b bVar2;
        C101198e.C101199b bVar3 = bVar;
        C87412m.m108594g(bVar3, "status");
        if (bVar3 != C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT) {
            Log.m105924i("MicroMsg.Image2VideoPluginLayout", "statusChange " + bVar3 + " ,param : " + bundle);
        } else {
            Bundle bundle2 = bundle;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 58) {
            if (ordinal != 62) {
                super.mo14585p(bVar, bundle);
            } else {
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
                int i3 = 2;
                if (getMoreMenuPlugin().f224408n == 2) {
                    CaptureDataManager.f272890c.f272892b.putString("key_group_list", getMoreMenuPlugin().mo106974a());
                } else if (getMoreMenuPlugin().f224408n == 3) {
                    CaptureDataManager.f272890c.f272892b.putString("key_black_list", getMoreMenuPlugin().mo106974a());
                }
                boolean c = getAddMusicPlugin().mo161620c();
                AudioCacheInfo audioCacheInfo = getAddMusicPlugin().f329710j;
                ArrayList<C92262a> d = getItemContainerPlugin().mo138890d((Matrix) null);
                ArrayList<C92007a> c2 = getItemContainerPlugin().mo138889c();
                float[] b = getItemContainerPlugin().mo138888b();
                C109382z zVar = this.f272978E;
                if (zVar == null || (bVar2 = zVar.f327456e) == null || (arrayList = bVar2.f288190k) == null) {
                    arrayList = new ArrayList<>();
                }
                C97882i iVar = new C97882i(c, audioCacheInfo, d, c2, b, 0, 0, arrayList, (String) null, getItemContainerPlugin().mo138893h(), 256, (C8480h) null);
                Log.m105924i("MicroMsg.Image2VideoPluginLayout", "edit config: " + iVar);
                getReMuxPlugin().mo138878m(iVar);
                C110992d dVar = C110992d.f332425a;
                dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138891f()));
                dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138892g()));
                dVar.mo162677k("KEY_SELECT_MUSIC_INT", Integer.valueOf(getAddMusicPlugin().f329710j == null ? 0 : 1));
                dVar.mo162677k("KEY_SELECT_ORIGIN_INT", Integer.valueOf(getAddMusicPlugin().mo161620c() ^ true ? 1 : 0));
                dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
                dVar.mo162672f();
                Iterator<C92007a> it = getItemContainerPlugin().mo138889c().iterator();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    j = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    C92007a next = it.next();
                    int ordinal2 = next.f263402a.ordinal();
                    if (ordinal2 == 0) {
                        i5++;
                    } else if (ordinal2 == 1) {
                        i4++;
                    } else if (ordinal2 == i3) {
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
                    } else if (ordinal2 == 3) {
                        C110992d.f332428d.f310288B = 1;
                    } else if (ordinal2 == 4) {
                        C110992d.f332428d.f310287A = 1;
                    }
                    i3 = 2;
                }
                StoryDoPublishStruct storyDoPublishStruct4 = C110992d.f332428d;
                storyDoPublishStruct4.f310299l = (long) i4;
                storyDoPublishStruct4.f310300m = (long) i5;
                storyDoPublishStruct4.f310311x = getMoreMenuPlugin().f224407j ? 1 : 0;
                StoryDoPublishStruct storyDoPublishStruct5 = C110992d.f332428d;
                AudioCacheInfo audioCacheInfo2 = getAddMusicPlugin().f329710j;
                if (!(audioCacheInfo2 != null && audioCacheInfo2.f163821p == 4)) {
                    j = 0;
                }
                storyDoPublishStruct5.f310310w = j;
                StringBuilder sb5 = new StringBuilder();
                C98324b captureInfo = getCaptureInfo();
                if (!(captureInfo == null || (arrayList2 = captureInfo.f288190k) == null)) {
                    for (String decodeFile : arrayList2) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(decodeFile, options);
                        int i6 = options.outWidth;
                        sb5.append(options.outHeight + XVFSFile.PATH_SEPARATOR_CHAR + i6 + "||");
                    }
                }
                int lastIndexOf = sb5.lastIndexOf("||");
                if (lastIndexOf >= 0) {
                    StoryDoPublishStruct storyDoPublishStruct6 = C110992d.f332428d;
                    storyDoPublishStruct6.f310289C = storyDoPublishStruct6.mo86045b("PhotoWidthHeightScales", sb5.substring(0, lastIndexOf).toString(), true);
                }
                C110992d dVar2 = C110992d.f332425a;
                dVar2.mo162670d(13);
                C110992d.f332428d.f310296i = System.currentTimeMillis();
                RecordConfigProvider configProvider = getConfigProvider();
                if (configProvider != null) {
                    i2 = configProvider.f272905F;
                }
                dVar2.mo162671e(i2);
                return;
            }
        }
    }
}
