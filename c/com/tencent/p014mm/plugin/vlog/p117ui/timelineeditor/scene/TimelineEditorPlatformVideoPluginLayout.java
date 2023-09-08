package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import ai2.C92007a;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92012f;
import ai2.C92020n;
import ai2.C92023q;
import ai2.C92025s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import ci2.C104379c;
import ci2.C104380d;
import ci2.C28564a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.model.audio.LyricsInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropViewGroup;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit.TimeEditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d23.C106976a;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gi2.C98129b;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j23.C108531a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jh2.C60863m;
import kj2.C61103a;
import kotlin.Metadata;
import l23.C109245y0;
import lh2.C109348i;
import m23.C109475c;
import o23.C109923a;
import q23.C110351a;
import qh2.C101198e;
import rr3.C110625c0;
import rr3.C110629f;
import rr3.C110630g;
import rr3.C110644t;
import rr3.C110646v;
import rx3.C13598b0;
import rx3.C36570n;
import sf0.C48374j0;
import sp3.C110801c;
import sp3.C110807k;
import sx3.C36907w;
import te3.C49044cs2;
import te3.C64339ea;
import te3.C64346ep3;
import v23.C102143q;
import v23.C111348f;
import v23.C111353i;
import v23.C111360j;
import v23.C111361k;
import v23.C111362l;
import v23.C111364o;
import v23.C111367p;
import v23.C111379x;
import wg2.C102440a;
import wx3.C15601d;
import x23.C102552a;
import y23.C102799b;
import y23.C112385a;
import y23.C112386e;
import y23.C112387g;
import y23.C112388h;
import y23.C112389i;
import y23.C15929d;
import zg2.C103020m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Lv23/f$a;", "Lci2/d;", "getCurrentTrackTimeRange", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout */
public class TimelineEditorPlatformVideoPluginLayout extends TimelineEditorBaseVideoPluginLayout implements C111348f.C111349a {

    /* renamed from: w */
    public static final /* synthetic */ int f316980w = 0;

    /* renamed from: v */
    public final HashMap<String, ArrayList<C104380d>> f316981v = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout$b */
    public static final class C96577b extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorPlatformVideoPluginLayout f282705d;

        /* renamed from: e */
        public final /* synthetic */ AudioCacheInfo f282706e;

        /* renamed from: f */
        public final /* synthetic */ Rect f282707f;

        /* renamed from: g */
        public final /* synthetic */ Rect f282708g;

        /* renamed from: h */
        public final /* synthetic */ Rect f282709h;

        /* renamed from: i */
        public final /* synthetic */ boolean f282710i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96577b(TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout, AudioCacheInfo audioCacheInfo, Rect rect, Rect rect2, Rect rect3, boolean z) {
            super(2);
            this.f282705d = timelineEditorPlatformVideoPluginLayout;
            this.f282706e = audioCacheInfo;
            this.f282707f = rect;
            this.f282708g = rect2;
            this.f282709h = rect3;
            this.f282710i = z;
        }

        public Object invoke(Object obj, Object obj2) {
            T t = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                if (!(t == null || t.length() == 0)) {
                    String r = this.f282705d.mo152376r();
                    Log.m105924i(r, "download music success, " + t);
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = t;
                    C0001s1 s1Var = C0001s1.f0d;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C96579a(this.f282706e, f0Var, this.f282705d, t, this.f282707f, this.f282708g, this.f282709h, this.f282710i, (C15601d<? super C96579a>) null), 2, (Object) null);
                    return C13598b0.f38549a;
                }
            }
            Log.m105920e(this.f282705d.mo152376r(), "download music failed");
            C111379x xVar = (C111379x) this.f282705d.mo151221j(C111379x.class);
            if (xVar != null) {
                xVar.mo163044x();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout$c */
    public static final class C96578c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorPlatformVideoPluginLayout f282711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96578c(TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout) {
            super(1);
            this.f282711d = timelineEditorPlatformVideoPluginLayout;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C111379x xVar = (C111379x) this.f282711d.mo151221j(C111379x.class);
            if (xVar != null) {
                xVar.mo163044x();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout$a */
    public static final class C106292a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorPlatformVideoPluginLayout f316982d;

        public C106292a(TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout) {
            this.f316982d = timelineEditorPlatformVideoPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout$initPluginLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout = this.f316982d;
            int i = TimelineEditorPlatformVideoPluginLayout.f316980w;
            if (timelineEditorPlatformVideoPluginLayout.f315314e) {
                C101198e.C62622a.m73576a(timelineEditorPlatformVideoPluginLayout, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout$initPluginLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorPlatformVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final C104380d getCurrentTrackTimeRange() {
        C110801c currentTrack = getCurrentTrack();
        if (currentTrack == null) {
            return null;
        }
        C104380d dVar = new C104380d(0, false, 3, (C8480h) null);
        dVar.mo146050d(currentTrack.f331464b, currentTrack.f331465c);
        String str = currentTrack.f331482t;
        if (this.f316981v.get(str) == null) {
            this.f316981v.put(str, new ArrayList());
        }
        ArrayList arrayList = this.f316981v.get(str);
        if (arrayList == null) {
            return dVar;
        }
        arrayList.add(dVar);
        return dVar;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        super.mo78564e();
        C112389i iVar = (C112389i) mo151221j(C112389i.class);
        if (iVar == null) {
            return true;
        }
        for (Map.Entry<String, C112388h<? extends C61103a>> value : iVar.f336505g.entrySet()) {
            ((C112388h) value.getValue()).mo142541d();
        }
        return true;
    }

    /* renamed from: h */
    public void mo152387h(C110807k kVar) {
        ArrayList<C110801c> arrayList;
        ArrayList<C110801c> arrayList2;
        if (!(kVar == null || (arrayList2 = kVar.f331511l) == null)) {
            for (C110801c cVar : arrayList2) {
                ArrayList<C104380d> arrayList3 = this.f316981v.get(cVar.f331482t);
                if (arrayList3 != null) {
                    for (C104380d dVar : arrayList3) {
                        long j = cVar.f331464b;
                        long j2 = cVar.f331465c;
                        dVar.f309018a.mo146046c(j);
                        dVar.f309019b.mo146046c(j2);
                    }
                }
            }
        }
        C109475c cVar2 = (C109475c) mo151221j(C109475c.class);
        if (cVar2 != null) {
            cVar2.f327693s.get(0).clear();
            if (!(kVar == null || (arrayList = kVar.f331511l) == null)) {
                Iterator<C110801c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C110801c next = it.next();
                    C28564a aVar = new C28564a(next.f331482t, next.f331466d, next.f331467e, next.f331468f);
                    cVar2.f327693s.get(0).add(aVar);
                    Log.m105924i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
                }
            }
            if (cVar2.f327697w) {
                cVar2.mo160711C(0);
                cVar2.mo160713E(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        r7 = r7.f272912M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0160, code lost:
        if ((r7 != null ? (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r7.getParcelable("KEY_SELECT_AUDIO_INFO") : null) != null) goto L_0x0162;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            super.mo129855l(r17)
            java.lang.Class<v23.q> r2 = v23.C102143q.class
            lh2.g0 r2 = r1.mo151221j(r2)
            v23.q r2 = (v23.C102143q) r2
            if (r2 == 0) goto L_0x0013
            r2.f300794i = r0
        L_0x0013:
            java.lang.Class<y23.i> r2 = y23.C112389i.class
            lh2.g0 r2 = r1.mo151221j(r2)
            y23.i r2 = (y23.C112389i) r2
            if (r2 == 0) goto L_0x0348
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r16.getConfigProvider()
            java.lang.String r3 = x23.C112038b.m152775b(r3)
            java.lang.String r4 = "21875"
            y23.h r5 = r2.mo164106y(r4)
            y23.e r5 = (y23.C112386e) r5
            if (r5 == 0) goto L_0x0039
            T r5 = r5.f336503d
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) r5
            if (r5 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r5.mo1040v(r3)
        L_0x0039:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r16.getConfigProvider()
            java.lang.String r3 = x23.C112038b.m152776c(r3)
            y23.h r5 = r2.mo164106y(r4)
            y23.e r5 = (y23.C112386e) r5
            if (r5 == 0) goto L_0x0053
            T r5 = r5.f336503d
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) r5
            if (r5 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r5.mo1041w(r3)
        L_0x0053:
            y23.h r3 = r2.mo164106y(r4)
            y23.e r3 = (y23.C112386e) r3
            java.lang.String r4 = "editId"
            if (r3 == 0) goto L_0x0066
            java.lang.String r5 = r16.getEditId()
            gy3.C87412m.m108594g(r5, r4)
            r3.f336498f = r5
        L_0x0066:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r16.getConfigProvider()
            java.lang.String r5 = "MicroMsg.TimelineEditorModelParser"
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x0092
            android.os.Bundle r3 = r3.f272912M
            java.lang.String r7 = "post_id"
            java.lang.String r3 = r3.getString(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getPostId by parse:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            java.lang.String r5 = "ret"
            gy3.C87412m.m108593f(r3, r5)
            goto L_0x0098
        L_0x0092:
            java.lang.String r3 = "getPostId by default:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r3 = r6
        L_0x0098:
            java.lang.String r5 = "19904"
            y23.h r7 = r2.mo164106y(r5)
            y23.a r7 = (y23.C112385a) r7
            java.lang.String r8 = "EditId"
            r9 = 1
            if (r7 == 0) goto L_0x00b9
            java.lang.String r10 = r16.getEditId()
            gy3.C87412m.m108594g(r10, r4)
            T r7 = r7.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r7 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r7
            if (r7 != 0) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r10 = r7.mo86045b(r8, r10, r9)
            r7.f310215e = r10
        L_0x00b9:
            y23.h r7 = r2.mo164106y(r5)
            y23.a r7 = (y23.C112385a) r7
            if (r7 == 0) goto L_0x00d0
            T r7 = r7.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r7 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r7
            if (r7 != 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r10 = "PostId"
            java.lang.String r10 = r7.mo86045b(r10, r3, r9)
            r7.f310214d = r10
        L_0x00d0:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r16.getConfigProvider()
            r10 = 0
            if (r7 == 0) goto L_0x00e4
            android.os.Bundle r7 = r7.f272912M
            if (r7 == 0) goto L_0x00e4
            java.lang.String r11 = "key_beauty_config"
            android.os.Parcelable r7 = r7.getParcelable(r11)
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r7 = (com.tencent.p014mm.plugin.xlabeffect.XEffectConfig) r7
            goto L_0x00e5
        L_0x00e4:
            r7 = r10
        L_0x00e5:
            y23.h r5 = r2.mo164106y(r5)
            y23.a r5 = (y23.C112385a) r5
            if (r5 == 0) goto L_0x0102
            T r5 = r5.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct) r5
            if (r5 != 0) goto L_0x00f4
            goto L_0x0102
        L_0x00f4:
            if (r7 == 0) goto L_0x00f9
            java.lang.String r7 = r7.f318439I
            goto L_0x00fa
        L_0x00f9:
            r7 = r10
        L_0x00fa:
            java.lang.String r11 = "BeautyInfo"
            java.lang.String r7 = r5.mo86045b(r11, r7, r9)
            r5.f310212C = r7
        L_0x0102:
            th2.d r5 = th2.C110992d.f332425a
            java.lang.String r7 = "KEY_MULTI_MEDIA_POST_ID_STRING"
            r5.mo162677k(r7, r3)
            java.lang.String r3 = r16.getEditId()
            java.lang.String r7 = "KEY_MULTI_MEDIA_EDIT_ID_STRING"
            r5.mo162677k(r7, r3)
            java.lang.String r3 = "20741"
            y23.h r5 = r2.mo164106y(r3)
            y23.b r5 = (y23.C102799b) r5
            if (r5 == 0) goto L_0x0130
            java.lang.String r7 = r16.getEditId()
            gy3.C87412m.m108594g(r7, r4)
            T r5 = r5.f336503d
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) r5
            if (r5 != 0) goto L_0x012a
            goto L_0x0130
        L_0x012a:
            java.lang.String r7 = r5.mo86045b(r8, r7, r9)
            r5.f265739d = r7
        L_0x0130:
            y23.h r3 = r2.mo164106y(r3)
            y23.b r3 = (y23.C102799b) r3
            r5 = 0
            if (r3 == 0) goto L_0x0167
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r16.getConfigProvider()
            if (r7 == 0) goto L_0x0164
            android.os.Bundle r8 = r7.f272912M
            if (r8 == 0) goto L_0x014a
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r8 = r8.getString(r11)
            goto L_0x014b
        L_0x014a:
            r8 = r10
        L_0x014b:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0152
            goto L_0x0162
        L_0x0152:
            android.os.Bundle r7 = r7.f272912M
            if (r7 == 0) goto L_0x015f
            java.lang.String r8 = "KEY_SELECT_AUDIO_INFO"
            android.os.Parcelable r7 = r7.getParcelable(r8)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r7
            goto L_0x0160
        L_0x015f:
            r7 = r10
        L_0x0160:
            if (r7 == 0) goto L_0x0164
        L_0x0162:
            r7 = 1
            goto L_0x0165
        L_0x0164:
            r7 = 0
        L_0x0165:
            r3.f303495g = r7
        L_0x0167:
            if (r0 == 0) goto L_0x018a
            android.os.Bundle r0 = r0.f288193n
            if (r0 == 0) goto L_0x018a
            java.lang.String r3 = "KEY_POST_VIDEO_TEMPLATE"
            byte[] r0 = r0.getByteArray(r3)
            if (r0 == 0) goto L_0x018a
            te3.ap1 r3 = new te3.ap1
            r3.<init>()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x017f }
            r10 = r3
            goto L_0x018a
        L_0x017f:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r5] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r6, r0)
        L_0x018a:
            java.lang.String r0 = "21874"
            y23.h r0 = r2.mo164106y(r0)
            y23.d r0 = (y23.C15929d) r0
            if (r0 == 0) goto L_0x01b7
            r0.f42803n = r6
            if (r10 == 0) goto L_0x01b7
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r6 = r10.f182115d
            java.lang.String r7 = "shooting_templateid"
            r3.put(r7, r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "JSONObject().also {\n    …\n            }.toString()"
            gy3.C87412m.m108593f(r3, r6)
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            java.lang.String r3 = z04.C112551y.m153814n(r3, r6, r7, r5)
            r0.f42803n = r3
        L_0x01b7:
            java.lang.String r0 = "25496"
            y23.h r0 = r2.mo164106y(r0)
            y23.g r0 = (y23.C112387g) r0
            if (r0 == 0) goto L_0x0348
            java.lang.String r2 = r16.getEditId()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r16.getConfigProvider()
            gy3.C87412m.m108594g(r2, r4)
            java.lang.Class<ht1.u1> r4 = ht1.C60206u1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.u1 r4 = (ht1.C60206u1) r4
            int r4 = r4.mo60953lE()
            if (r4 != 0) goto L_0x01dc
            goto L_0x0348
        L_0x01dc:
            r0.f336502f = r2
            r4 = 6
            rx3.l[] r4 = new rx3.C13604l[r4]
            r6 = 2131301291(0x7f0913ab, float:1.8220636E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "edit_page_bgm"
            r7.<init>(r6, r8)
            r4[r5] = r7
            r6 = 2131301297(0x7f0913b1, float:1.8220648E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "edit_page_emoji"
            r7.<init>(r6, r8)
            r4[r9] = r7
            r6 = 2131301307(0x7f0913bb, float:1.8220668E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "edit_page_word"
            r7.<init>(r6, r8)
            r6 = 2
            r4[r6] = r7
            r7 = 3
            r8 = 2131301318(0x7f0913c6, float:1.822069E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "edit_page_clip"
            r10.<init>(r8, r11)
            r4[r7] = r10
            r7 = 4
            r8 = 2131301294(0x7f0913ae, float:1.8220642E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "identify_subtitle"
            r10.<init>(r8, r11)
            r4[r7] = r10
            r7 = 5
            r8 = 2131315242(0x7f094a2a, float:1.8248932E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "edit_page_finish"
            r10.<init>(r8, r11)
            r4[r7] = r10
            java.util.Map r4 = sx3.C90364q0.m113147f(r4)
            r7 = 0
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r10 = r0.f336501e
            java.lang.Class<v23.f> r11 = v23.C111348f.class
            lh2.g0 r10 = r10.mo151221j(r11)
            v23.f r10 = (v23.C111348f) r10
            if (r10 == 0) goto L_0x027a
            sp3.k r10 = r10.f333357h
            if (r10 == 0) goto L_0x027a
            com.tencent.mm.plugin.vlog.model.p0 r10 = x23.C102552a.m135387a(r10)
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r10 = r10.f282570c
            java.util.Iterator r10 = r10.iterator()
        L_0x0265:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x027a
            java.lang.Object r11 = r10.next()
            com.tencent.mm.plugin.vlog.model.q0 r11 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r11
            sp3.c r11 = r11.f316501l
            long r12 = r11.f331467e
            long r14 = r11.f331466d
            long r12 = r12 - r14
            long r7 = r7 + r12
            goto L_0x0265
        L_0x027a:
            java.lang.String r10 = x23.C112038b.m152775b(r3)
            java.lang.String r11 = x23.C112038b.m152774a(r3)
            java.lang.String r3 = x23.C112038b.m152776c(r3)
            java.lang.String r12 = "101"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "initReport, editId:"
            r13.append(r14)
            r13.append(r2)
            java.lang.String r2 = " finderContextId:"
            r13.append(r2)
            r13.append(r10)
            java.lang.String r2 = " tabContextId:"
            r13.append(r2)
            r13.append(r11)
            java.lang.String r2 = " sessionId:"
            r13.append(r2)
            r13.append(r3)
            java.lang.String r2 = " commentScene:"
            r13.append(r2)
            r13.append(r12)
            java.lang.String r2 = " duration:"
            r13.append(r2)
            r13.append(r7)
            java.lang.String r2 = r13.toString()
            java.lang.String r13 = "TimelineEditorReport25496"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x02ce:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0348
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r13 = r0.f336501e
            java.lang.Object r14 = r4.getKey()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            android.view.View r13 = r13.findViewById(r14)
            if (r13 == 0) goto L_0x0342
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class<l31.e> r14 = l31.C61212e.class
            di3.d r15 = di3.C86312j.m106911c(r14)
            l31.e r15 = (l31.C61212e) r15
            r15.o30(r13, r4)
            di3.d r4 = di3.C86312j.m106911c(r14)
            l31.e r4 = (l31.C61212e) r4
            r15 = 8
            r9 = 25496(0x6398, float:3.5728E-41)
            r4.mo86175pO(r13, r15, r9)
            di3.d r4 = di3.C86312j.m106911c(r14)
            l31.e r4 = (l31.C61212e) r4
            rx3.l[] r9 = new rx3.C13604l[r6]
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            rx3.l r6 = new rx3.l
            java.lang.String r1 = "video_duration_time"
            r6.<init>(r1, r15)
            r9[r5] = r6
            java.lang.String r1 = r0.f336502f
            rx3.l r6 = new rx3.l
            java.lang.String r15 = "editid"
            r6.<init>(r15, r1)
            r1 = 1
            r9[r1] = r6
            java.util.Map r6 = sx3.C90364q0.m113147f(r9)
            r4.mo86149PM(r13, r6)
            di3.d r4 = di3.C86312j.m106911c(r14)
            l31.e r4 = (l31.C61212e) r4
            y23.f r6 = new y23.f
            r6.<init>(r3, r10, r11, r12)
            r4.E60(r13, r6)
            goto L_0x0343
        L_0x0342:
            r1 = 1
        L_0x0343:
            r1 = r16
            r6 = 2
            r9 = 1
            goto L_0x02ce
        L_0x0348:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout.mo129855l(h90.b):void");
    }

    /* renamed from: o */
    public void mo152374o() {
        Class cls = C111367p.class;
        super.mo152374o();
        TimeEditorItemContainer timeEditorItemContainer = (TimeEditorItemContainer) findViewById(C0966R.C0970id.l5o);
        C87412m.m108593f(timeEditorItemContainer, "editorContainerView");
        new C110351a(timeEditorItemContainer, this);
        C111367p pVar = (C111367p) mo151221j(cls);
        if (pVar != null) {
            pVar.mo163038x(timeEditorItemContainer);
        }
        C111348f fVar = (C111348f) mo151221j(C111348f.class);
        if (fVar != null) {
            fVar.f333360n.add(this);
        }
        View findViewById = findViewById(C0966R.C0970id.ccz);
        C87412m.m108593f(findViewById, "findViewById(R.id.editor_time_edit_panel)");
        C111353i iVar = new C111353i((EditorPanelHolder) findViewById, this);
        C111367p pVar2 = (C111367p) mo151221j(cls);
        if (pVar2 != null) {
            pVar2.mo163038x(iVar);
        }
        View findViewById2 = findViewById(C0966R.C0970id.kl6);
        C87412m.m108593f(findViewById2, "findViewById(R.id.timeline_finish)");
        new C102143q(findViewById2, this);
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Intent intent = ((Activity) context).getIntent();
        C87412m.m108593f(intent, "context as Activity).intent");
        C112389i iVar2 = new C112389i(this, intent);
        iVar2.mo164105x(new C112385a(this));
        iVar2.mo164105x(new C102799b(this));
        iVar2.mo164105x(new C112386e(this));
        iVar2.mo164105x(new C15929d(this));
        iVar2.mo164105x(new C112387g(this));
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C110351a aVar;
        C110807k kVar;
        C102143q qVar;
        RectF rectF;
        RectF rectF2;
        int i;
        EmojiInfo emojiInfo;
        int i2;
        C110807k kVar2;
        C111353i iVar;
        C92007a aVar2;
        C110807k kVar3;
        C111367p pVar;
        C92007a aVar3;
        C111367p pVar2;
        C111367p pVar3;
        C101198e.C101199b bVar2 = bVar;
        Bundle bundle2 = bundle;
        Class cls = C102143q.class;
        C98129b bVar3 = C98129b.EditItemTypeLyrics;
        C92011d dVar = C92011d.CAPTION;
        C92011d dVar2 = C92011d.RECORD_CAPTION;
        Class cls2 = C111353i.class;
        Class cls3 = C111348f.class;
        Class cls4 = C109475c.class;
        Class cls5 = C111367p.class;
        C87412m.m108594g(bVar2, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 37) {
            if (ordinal == 39) {
                mo152384y();
                TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                C110351a aVar4 = (C110351a) mo151221j(C110351a.class);
                if (aVar4 != null) {
                    C92007a aVar5 = aVar4.f330094g;
                    if (aVar5 != null) {
                        aVar4.mo161858P(aVar5);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } else if (ordinal == 52) {
                long j = 0;
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN");
                    LyricsInfo lyricsInfo = (LyricsInfo) bundle2.getParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST");
                    ArrayList arrayList = new ArrayList();
                    if (lyricsInfo != null) {
                        Iterator<byte[]> it = lyricsInfo.f315278d.iterator();
                        while (it.hasNext()) {
                            byte[] next = it.next();
                            C49044cs2 cs22 = new C49044cs2();
                            if (next != null) {
                                try {
                                    cs22.parseFrom(next);
                                } catch (Exception e) {
                                    Log.printDebugStack("safeParser", "", e);
                                }
                            }
                            arrayList.add(cs22);
                        }
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                    if (z) {
                        C108531a aVar6 = (C108531a) mo151221j(C108531a.class);
                        AudioCacheInfo audioCacheInfo = aVar6 != null ? aVar6.f324881p : null;
                        if (audioCacheInfo != null) {
                            j = (long) audioCacheInfo.f163822q;
                        }
                        C92020n nVar = new C92020n((List<? extends C49044cs2>) arrayList, j);
                        C110351a aVar7 = (C110351a) mo151221j(C110351a.class);
                        if (aVar7 != null) {
                            aVar7.f330093f.mo152268n(bVar3);
                            C13598b0 b0Var3 = C13598b0.f38549a;
                        }
                        C110351a aVar8 = (C110351a) mo151221j(C110351a.class);
                        if (aVar8 != null) {
                            C110351a.m150172z(aVar8, nVar, (C106205q0) null, (String) null, 0, 12, (Object) null);
                            C13598b0 b0Var4 = C13598b0.f38549a;
                        }
                    } else {
                        C110351a aVar9 = (C110351a) mo151221j(C110351a.class);
                        if (aVar9 != null) {
                            aVar9.f330093f.mo152268n(bVar3);
                            C13598b0 b0Var5 = C13598b0.f38549a;
                        }
                    }
                    C13598b0 b0Var6 = C13598b0.f38549a;
                }
                C13598b0 b0Var7 = C13598b0.f38549a;
            } else if (ordinal == 61) {
                mo152382t();
                C111367p pVar4 = (C111367p) mo151221j(cls5);
                if (pVar4 != null) {
                    pVar4.f333403f.stop();
                    C13598b0 b0Var8 = C13598b0.f38549a;
                }
                C111379x xVar = (C111379x) mo151221j(C111379x.class);
                if (xVar != null) {
                    C111379x.m151864y(xVar, (Integer) null, 1, (Object) null);
                    C13598b0 b0Var9 = C13598b0.f38549a;
                }
                C110351a aVar10 = (C110351a) mo151221j(C110351a.class);
                if (aVar10 != null) {
                    Rect rect = new Rect(0, 0, aVar10.f330093f.getWidth(), aVar10.f330093f.getHeight());
                    C102143q qVar2 = (C102143q) mo151221j(cls);
                    if (qVar2 != null) {
                        float[] H = aVar10.mo161850H();
                        ArrayList<C92007a> D = aVar10.mo161846D();
                        C87412m.m108594g(D, "editItems");
                        qVar2.f300796n.f186610d = new C64346ep3();
                        C64346ep3 ep32 = qVar2.f300796n.f186610d;
                        C87412m.m108593f(ep32, "editData.drawingRect");
                        C96551o.m123877g(rect, ep32);
                        qVar2.f300796n.f186613g = new C64346ep3();
                        Rect rect2 = new Rect((int) H[0], (int) H[1], (int) H[2], (int) H[3]);
                        C64346ep3 ep33 = qVar2.f300796n.f186613g;
                        C87412m.m108593f(ep33, "editData.validRect");
                        C96551o.m123877g(rect2, ep33);
                        LinkedList<C64339ea> linkedList = qVar2.f300796n.f186611e;
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(D, 10));
                        for (C92007a aVar11 : D) {
                            C64339ea eaVar = new C64339ea();
                            eaVar.f182947d = aVar11.f263402a.f263445d;
                            eaVar.f182948e = C48374j0.m53712a(aVar11.toProtoBuf().toByteArray());
                            arrayList2.add(eaVar);
                        }
                        linkedList.addAll(arrayList2);
                        C13598b0 b0Var10 = C13598b0.f38549a;
                    }
                    Rect rect3 = new Rect(0, 0, aVar10.f330093f.getWidth(), aVar10.f330093f.getHeight());
                    Rect rect4 = new Rect();
                    C111364o oVar = (C111364o) mo151221j(C111364o.class);
                    if (!(oVar == null || (rectF2 = oVar.f333399j) == null)) {
                        rectF2.round(rect4);
                        C13598b0 b0Var11 = C13598b0.f38549a;
                    }
                    C13598b0 b0Var12 = C13598b0.f38549a;
                    Rect rect5 = new Rect();
                    C111364o oVar2 = (C111364o) mo151221j(C111364o.class);
                    if (!(oVar2 == null || (rectF = oVar2.f333400n) == null)) {
                        rectF.round(rect5);
                    }
                    Log.m105924i("MicroMsg.BasePluginLayout", "cropRect:" + rect5);
                    C109245y0 y0Var = (C109245y0) mo151221j(C109245y0.class);
                    if (y0Var != null) {
                        y0Var.getClass();
                    }
                    C108531a aVar12 = (C108531a) mo151221j(C108531a.class);
                    AudioCacheInfo audioCacheInfo2 = aVar12 != null ? aVar12.f324881p : null;
                    if (audioCacheInfo2 != null) {
                        C60863m.f173404c.mo85769c(audioCacheInfo2, new C96577b(this, audioCacheInfo2, rect3, rect4, rect5, false));
                    } else {
                        C111348f fVar = (C111348f) mo151221j(cls3);
                        if (!(fVar == null || (kVar = fVar.f333357h) == null || (qVar = (C102143q) mo151221j(cls)) == null)) {
                            qVar.mo141685x(kVar, getEditId(), rect3, rect4, rect5, false, new C96578c(this));
                        }
                    }
                }
            } else if (ordinal == 64) {
                if (bundle2 != null) {
                    int i3 = bundle2.getInt("PARAM_DELETE_VIEW_TYPE_INT");
                    if (i3 == 4) {
                        C108531a aVar13 = (C108531a) mo151221j(C108531a.class);
                        if (aVar13 != null) {
                            aVar13.mo159381A();
                            C13598b0 b0Var13 = C13598b0.f38549a;
                        }
                    } else if (i3 == 6) {
                        C109475c cVar = (C109475c) mo151221j(cls4);
                        if (cVar != null) {
                            cVar.mo160718z(0);
                            C13598b0 b0Var14 = C13598b0.f38549a;
                        }
                    } else {
                        if (i3 == 7) {
                            C109475c cVar2 = (C109475c) mo151221j(cls4);
                            if (cVar2 != null) {
                                i = 1;
                                cVar2.mo160718z(1);
                            }
                        } else {
                            i = 1;
                        }
                        C13598b0 b0Var15 = C13598b0.f38549a;
                        TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, i, (Object) null);
                        C13598b0 b0Var16 = C13598b0.f38549a;
                    }
                }
                i = 1;
                TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, i, (Object) null);
                C13598b0 b0Var162 = C13598b0.f38549a;
            } else if (ordinal != 104) {
                if (ordinal == 100) {
                    mo152373n();
                    C111353i iVar2 = (C111353i) mo151221j(cls2);
                    if (iVar2 != null) {
                        iVar2.mo163032x().setEnableLengthEdit(true);
                        C13598b0 b0Var17 = C13598b0.f38549a;
                    }
                    C110351a aVar14 = (C110351a) mo151221j(C110351a.class);
                    if (!(aVar14 == null || (aVar2 = aVar14.f330094g) == null)) {
                        C111353i iVar3 = (C111353i) mo151221j(cls2);
                        if (iVar3 != null) {
                            iVar3.f333383t = aVar2;
                            C13598b0 b0Var18 = C13598b0.f38549a;
                        }
                        C111367p pVar5 = (C111367p) mo151221j(cls5);
                        if (pVar5 != null) {
                            pVar5.mo163040z(aVar2.f263404c.mo146049c(), aVar2.f263404c.mo146048b());
                            C13598b0 b0Var19 = C13598b0.f38549a;
                        }
                    }
                    C111348f fVar2 = (C111348f) mo151221j(cls3);
                    if (fVar2 == null || (kVar2 = fVar2.f333357h) == null || (iVar = (C111353i) mo151221j(cls2)) == null) {
                        i2 = 1;
                    } else {
                        C92007a aVar15 = iVar.f333383t;
                        if (aVar15 != null) {
                            if (!iVar.f333377n) {
                                iVar.f333377n = true;
                                iVar.f333372f.setCloseTouchOutside(true);
                                iVar.mo163032x().setCallback(iVar.f333384u);
                                iVar.mo163032x().setRealTimeCallback(iVar.f333384u);
                                iVar.f333372f.setOnVisibleChangeCallback(new C111360j(iVar));
                                ((ImageView) ((C36570n) iVar.f333375i).getValue()).setOnClickListener(new C111361k(iVar));
                                ((ImageView) ((C36570n) iVar.f333376j).getValue()).setOnClickListener(new C111362l(iVar));
                            }
                            long j2 = (long) 1000;
                            long startUs = kVar2.mo162387j().getStartUs() / j2;
                            iVar.f333378o = kVar2.mo162387j().getEndUs() / j2;
                            long b = aVar15.f263404c.mo146048b();
                            long j3 = iVar.f333378o;
                            if (b > j3) {
                                C104379c cVar3 = aVar15.f263404c.f309019b;
                                cVar3.mo146046c(cVar3.f309015c + (j3 - cVar3.mo146044a()));
                            }
                            iVar.f333379p = aVar15.f263404c.mo146049c();
                            long b2 = aVar15.f263404c.mo146048b();
                            iVar.f333380q = b2;
                            iVar.f333381r = iVar.f333379p;
                            iVar.f333382s = b2;
                            C104380d dVar3 = new C104380d(0, false, 3, (C8480h) null);
                            dVar3.mo146050d(iVar.f333381r, iVar.f333382s);
                            aVar15.f263403b = dVar3;
                            Log.m105924i("MicroMsg.VLogTimeEditPlugin", "time range:" + aVar15.f263404c);
                            TimeCropViewGroup x = iVar.mo163032x();
                            C96552p0 a = C102552a.m135387a(kVar2);
                            C92007a aVar16 = iVar.f333383t;
                            C87412m.m108591d(aVar16);
                            long c = aVar16.f263404c.mo146049c();
                            C92007a aVar17 = iVar.f333383t;
                            C87412m.m108591d(aVar17);
                            x.mo152236b(a, c, aVar17.f263404c.mo146048b());
                            EditorPanelHolder editorPanelHolder = iVar.f333372f;
                            i2 = 1;
                            editorPanelHolder.setShow(true);
                        } else {
                            i2 = 1;
                        }
                        C13598b0 b0Var20 = C13598b0.f38549a;
                    }
                    TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, i2, (Object) null);
                    C13598b0 b0Var21 = C13598b0.f38549a;
                } else if (ordinal != 101) {
                    switch (ordinal) {
                        case 108:
                            if (bundle2 != null) {
                                if (bundle2.getInt("PARAM_1_INT") != 0) {
                                    dVar = dVar2;
                                }
                                byte[] byteArray = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                C87412m.m108591d(byteArray);
                                C92010c cVar4 = new C92010c(dVar, byteArray);
                                C110351a aVar18 = (C110351a) mo151221j(C110351a.class);
                                if (aVar18 != null) {
                                    C110351a.m150171y(aVar18, cVar4, getCurrentTrackTimeRange(), (String) null, 0, 12, (Object) null);
                                    C13598b0 b0Var22 = C13598b0.f38549a;
                                    break;
                                }
                            }
                            break;
                        case 109:
                            if (bundle2 != null) {
                                if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                    C109475c cVar5 = (C109475c) mo151221j(cls4);
                                    if (cVar5 != null) {
                                        cVar5.f327700z++;
                                        C13598b0 b0Var23 = C13598b0.f38549a;
                                    }
                                    mo152382t();
                                    int i4 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                    int i5 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                    String string = bundle2.getString("PARAM_EDIT_TEXT_FONT");
                                    C109348i iVar4 = (C109348i) mo151221j(C109348i.class);
                                    if (iVar4 != null) {
                                        byte[] byteArray2 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                        C87412m.m108591d(byteArray2);
                                        iVar4.mo160548z(byteArray2, i4, i5, string);
                                        C13598b0 b0Var24 = C13598b0.f38549a;
                                    }
                                }
                                C13598b0 b0Var25 = C13598b0.f38549a;
                                break;
                            }
                            break;
                        case 110:
                            if (bundle2 != null) {
                                if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                    mo152382t();
                                    mo152373n();
                                    C109475c cVar6 = (C109475c) mo151221j(cls4);
                                    if (cVar6 != null) {
                                        byte[] byteArray3 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                        C87412m.m108591d(byteArray3);
                                        cVar6.mo160714F(byteArray3);
                                        C13598b0 b0Var26 = C13598b0.f38549a;
                                    }
                                }
                                C13598b0 b0Var27 = C13598b0.f38549a;
                                break;
                            }
                            break;
                        case 111:
                            if (bundle2 != null) {
                                if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                    int i6 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                    int i7 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT", 0);
                                    String string2 = bundle2.getString("PARAM_EDIT_TEXT_FONT");
                                    C109475c cVar7 = (C109475c) mo151221j(cls4);
                                    if (cVar7 != null) {
                                        byte[] byteArray4 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                        C87412m.m108591d(byteArray4);
                                        cVar7.mo160716H(byteArray4, i6, i7, string2);
                                        C13598b0 b0Var28 = C13598b0.f38549a;
                                    }
                                }
                                if (bundle2.getLong("PARAM_1_LONG", -1) >= 0) {
                                    mo152383w(Long.valueOf(bundle2.getLong("PARAM_1_LONG")));
                                }
                                C13598b0 b0Var29 = C13598b0.f38549a;
                                break;
                            }
                            break;
                        case 112:
                            if (bundle2 != null) {
                                int i8 = bundle2.getInt("PARAM_1_INT");
                                C110351a aVar19 = (C110351a) mo151221j(C110351a.class);
                                if (aVar19 != null) {
                                    if (i8 == 1) {
                                        dVar = dVar2;
                                    }
                                    aVar19.f330093f.mo152267m(dVar);
                                    C13598b0 b0Var30 = C13598b0.f38549a;
                                    break;
                                }
                            }
                            break;
                        case 113:
                            TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                            C110351a aVar20 = (C110351a) mo151221j(C110351a.class);
                            if (aVar20 != null) {
                                aVar20.f330093f.mo152274r();
                                C13598b0 b0Var31 = C13598b0.f38549a;
                                break;
                            }
                            break;
                        default:
                            switch (ordinal) {
                                case 129:
                                    C110351a aVar21 = (C110351a) mo151221j(C110351a.class);
                                    if (!(aVar21 == null || (aVar3 = aVar21.f330094g) == null)) {
                                        mo152382t();
                                        C109923a aVar22 = (C109923a) mo151221j(C109923a.class);
                                        if (aVar22 != null) {
                                            aVar22.mo161249z(aVar3);
                                            C13598b0 b0Var32 = C13598b0.f38549a;
                                            break;
                                        }
                                    }
                                    break;
                                case 130:
                                    if (bundle2 != null) {
                                        bundle2.getLong("PARAM_1_LONG");
                                        C110351a aVar23 = (C110351a) mo151221j(C110351a.class);
                                        C92007a aVar24 = aVar23 != null ? aVar23.f330094g : null;
                                        C92023q qVar3 = aVar24 instanceof C92023q ? (C92023q) aVar24 : null;
                                        if (qVar3 != null) {
                                            EffectManager effectManager = C106976a.f320215h;
                                            C87412m.m108591d(effectManager);
                                            C110625c0 l = effectManager.mo154932l(qVar3.f263509h);
                                            if (l != null) {
                                                l.mo162189b(qVar3.f263404c.mo146049c(), qVar3.f263404c.mo146048b());
                                                C13598b0 b0Var33 = C13598b0.f38549a;
                                            }
                                        }
                                        C110351a aVar25 = (C110351a) mo151221j(C110351a.class);
                                        if (aVar25 != null) {
                                            aVar25.mo161857O();
                                            C13598b0 b0Var34 = C13598b0.f38549a;
                                        }
                                        C110351a aVar26 = (C110351a) mo151221j(C110351a.class);
                                        if (aVar26 != null) {
                                            aVar26.mo161855M(false);
                                            C13598b0 b0Var35 = C13598b0.f38549a;
                                        }
                                        C111348f fVar3 = (C111348f) mo151221j(cls3);
                                        if (fVar3 != null) {
                                            C110351a aVar27 = (C110351a) mo151221j(C110351a.class);
                                            C110807k D2 = fVar3.mo163028D(aVar27 != null ? aVar27.f330093f.getAllTTSData() : null);
                                            if (!(D2 == null || (pVar2 = (C111367p) mo151221j(cls5)) == null)) {
                                                C111367p.m151846A(pVar2, D2, false, false, 0, 14, (Object) null);
                                                C13598b0 b0Var36 = C13598b0.f38549a;
                                            }
                                        }
                                        TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                                        C13598b0 b0Var37 = C13598b0.f38549a;
                                        break;
                                    }
                                    break;
                                case 131:
                                    C110351a aVar28 = (C110351a) mo151221j(C110351a.class);
                                    if (aVar28 != null) {
                                        aVar28.mo161855M(false);
                                        C13598b0 b0Var38 = C13598b0.f38549a;
                                    }
                                    TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                                    C13598b0 b0Var39 = C13598b0.f38549a;
                                    break;
                                case 132:
                                    C110351a aVar29 = (C110351a) mo151221j(C110351a.class);
                                    if (aVar29 != null) {
                                        aVar29.mo161857O();
                                        C13598b0 b0Var40 = C13598b0.f38549a;
                                    }
                                    C110351a aVar30 = (C110351a) mo151221j(C110351a.class);
                                    if (aVar30 != null) {
                                        aVar30.mo161855M(false);
                                        C13598b0 b0Var41 = C13598b0.f38549a;
                                    }
                                    C111348f fVar4 = (C111348f) mo151221j(cls3);
                                    if (fVar4 != null) {
                                        C110351a aVar31 = (C110351a) mo151221j(C110351a.class);
                                        C110807k D3 = fVar4.mo163028D(aVar31 != null ? aVar31.f330093f.getAllTTSData() : null);
                                        if (!(D3 == null || (pVar3 = (C111367p) mo151221j(cls5)) == null)) {
                                            C111367p.m151846A(pVar3, D3, false, false, 0, 14, (Object) null);
                                            C13598b0 b0Var42 = C13598b0.f38549a;
                                        }
                                    }
                                    TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                                    C13598b0 b0Var43 = C13598b0.f38549a;
                                    break;
                                default:
                                    super.mo14585p(bVar, bundle);
                                    C13598b0 b0Var44 = C13598b0.f38549a;
                                    break;
                            }
                    }
                } else {
                    mo152384y();
                    C110351a aVar32 = (C110351a) mo151221j(C110351a.class);
                    C92007a aVar33 = aVar32 != null ? aVar32.f330094g : null;
                    C92023q qVar4 = aVar33 instanceof C92023q ? (C92023q) aVar33 : null;
                    if (qVar4 != null) {
                        EffectManager effectManager2 = C106976a.f320215h;
                        C87412m.m108591d(effectManager2);
                        C110625c0 l2 = effectManager2.mo154932l(qVar4.f263509h);
                        if (l2 != null) {
                            l2.mo162189b(qVar4.f263404c.mo146049c(), qVar4.f263404c.mo146048b());
                            C13598b0 b0Var45 = C13598b0.f38549a;
                        }
                        C110644t tVar = l2 instanceof C110644t ? (C110644t) l2 : null;
                        if (tVar != null) {
                            tVar.mo162193e(new C110629f((int) qVar4.f263513l, (int) qVar4.f263514m, qVar4.f263515n, qVar4.f263516o));
                            C13598b0 b0Var46 = C13598b0.f38549a;
                        }
                        C110646v vVar = l2 instanceof C110646v ? (C110646v) l2 : null;
                        if (vVar != null) {
                            vVar.mo162194f(new C110630g(qVar4.f263510i, 0.0f, (String) null, false, false, 30, (C8480h) null));
                            C13598b0 b0Var47 = C13598b0.f38549a;
                        }
                    }
                    C110351a aVar34 = (C110351a) mo151221j(C110351a.class);
                    if (aVar34 != null) {
                        aVar34.mo161855M(false);
                        C13598b0 b0Var48 = C13598b0.f38549a;
                    }
                    C111348f fVar5 = (C111348f) mo151221j(cls3);
                    if (!(fVar5 == null || (kVar3 = fVar5.f333357h) == null || (pVar = (C111367p) mo151221j(cls5)) == null)) {
                        pVar.mo163040z(0, kVar3.mo162389l());
                        C13598b0 b0Var49 = C13598b0.f38549a;
                    }
                    TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
                    C13598b0 b0Var50 = C13598b0.f38549a;
                }
            } else if (!(bundle2 == null || (emojiInfo = (EmojiInfo) bundle2.getParcelable("PARAM_EDIT_EMOJI_INFO")) == null)) {
                C104380d currentTrackTimeRange = getCurrentTrackTimeRange();
                C110351a aVar35 = (C110351a) mo151221j(C110351a.class);
                if (aVar35 != null) {
                    C110351a.m150171y(aVar35, new C92012f(emojiInfo, (Matrix) null, (Matrix) null, 6, (C8480h) null), currentTrackTimeRange, (String) null, 0, 12, (Object) null);
                    C13598b0 b0Var51 = C13598b0.f38549a;
                }
            }
        } else if (!(bundle2 == null || (aVar = (C110351a) mo151221j(C110351a.class)) == null)) {
            CharSequence charSequence = bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
            int i9 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR");
            int i15 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
            String string3 = bundle2.getString("PARAM_EDIT_TEXT_FONT");
            C87412m.m108591d(string3);
            C110351a.m150171y(aVar, new C92025s(charSequence, i9, i15, string3, 0, (Matrix) null, 48, (C8480h) null), getCurrentTrackTimeRange(), (String) null, 0, 12, (Object) null);
            TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
            C13598b0 b0Var52 = C13598b0.f38549a;
        }
        C112389i iVar5 = (C112389i) mo151221j(C112389i.class);
        if (iVar5 != null) {
            iVar5.mo14585p(bVar2, bundle2);
            C13598b0 b0Var53 = C13598b0.f38549a;
        }
    }

    /* renamed from: q */
    public void mo152375q(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        setOnClickListener(new C106292a(this));
        super.mo152375q(aVar, recordConfigProvider);
        C102143q qVar = (C102143q) mo151221j(C102143q.class);
        if (qVar != null) {
            qVar.f300795j = aVar;
            qVar.f300793h = recordConfigProvider;
        }
        C111364o oVar = (C111364o) mo151221j(C111364o.class);
        if (oVar != null) {
            Rect rect = new Rect();
            oVar.f333399j.round(rect);
            C110351a aVar2 = (C110351a) mo151221j(C110351a.class);
            if (aVar2 != null) {
                TimeEditorItemContainer timeEditorItemContainer = aVar2.f330093f;
                timeEditorItemContainer.getClass();
                timeEditorItemContainer.f316774j = recordConfigProvider;
            }
            C110351a aVar3 = (C110351a) mo151221j(C110351a.class);
            if (aVar3 != null) {
                aVar3.f330093f.mo152287x(rect);
            }
            oVar.f333399j.round(C103020m.f303988d);
        }
    }

    /* renamed from: r */
    public String mo152376r() {
        return "MicroMsg.TimelineEditorPlatformVideoPluginLayout";
    }
}
