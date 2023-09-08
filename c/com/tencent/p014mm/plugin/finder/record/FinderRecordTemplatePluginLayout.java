package com.tencent.p014mm.plugin.finder.record;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.media.ImageReader;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e80.C107254b;
import e80.C107258f;
import e80.C107259g;
import e80.C107260h;
import f14.C58901s;
import fh2.C97884j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import ha0.C108221t;
import hi2.C98453h;
import i80.C108400c;
import ia0.C108438c;
import j20.C117292a;
import ja0.C60781a;
import ja0.C60784e;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import lh2.C99471w0;
import lh2.C99473x0;
import p447aw.C103918d;
import p625nu.C61901d;
import p682rz.C36594q;
import p80.C110194c;
import qh2.C101198e;
import rh2.C110563b;
import rr1.C13100b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C36907w;
import te3.C64237ap1;
import te3.pr4;
import to1.C111040a;
import to1.C14061o;
import to1.C64963d;
import ug2.C102031b;
import uo1.C14267a;
import v70.C111387b;
import wg2.C102440a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/record/FinderRecordTemplatePluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordCheckAudioPermissionPluginLayout;", "Landroidx/lifecycle/s;", "Lnu/d$a;", "Lv70/b;", "Landroidx/lifecycle/j;", "getLifecycle", "Landroidx/lifecycle/u;", "p", "Lrx3/g;", "getLifecycleRegistry", "()Landroidx/lifecycle/u;", "lifecycleRegistry", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout */
public final class FinderRecordTemplatePluginLayout extends RecordCheckAudioPermissionPluginLayout implements C0125s, C61901d.C61902a, C111387b {

    /* renamed from: z */
    public static final /* synthetic */ int f312806z = 0;

    /* renamed from: o */
    public final String f312807o = String.valueOf(hashCode());

    /* renamed from: p */
    public final C13601g f312808p = C36568h.m40985a(new C105293d(this));

    /* renamed from: q */
    public final C110563b f312809q = new C110563b(true);

    /* renamed from: r */
    public final C108400c f312810r;

    /* renamed from: s */
    public final C99473x0 f312811s;

    /* renamed from: t */
    public final C99471w0 f312812t;

    /* renamed from: u */
    public final C64963d f312813u;

    /* renamed from: v */
    public final C108438c f312814v;

    /* renamed from: w */
    public final C111040a f312815w;

    /* renamed from: x */
    public C102440a f312816x;

    /* renamed from: y */
    public RecordConfigProvider f312817y;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {444, 445}, mo125471m = "glCreate")
    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$a */
    public static final class C105290a extends C66704d {

        /* renamed from: d */
        public Object f312818d;

        /* renamed from: e */
        public /* synthetic */ Object f312819e;

        /* renamed from: f */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312820f;

        /* renamed from: g */
        public int f312821g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105290a(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, C15601d<? super C105290a> dVar) {
            super(dVar);
            this.f312820f = finderRecordTemplatePluginLayout;
        }

        public final Object invokeSuspend(Object obj) {
            this.f312819e = obj;
            this.f312821g |= Integer.MIN_VALUE;
            return this.f312820f.mo149731i(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {454, 455}, mo125471m = "glRelease")
    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$b */
    public static final class C105291b extends C66704d {

        /* renamed from: d */
        public Object f312822d;

        /* renamed from: e */
        public /* synthetic */ Object f312823e;

        /* renamed from: f */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312824f;

        /* renamed from: g */
        public int f312825g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105291b(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, C15601d<? super C105291b> dVar) {
            super(dVar);
            this.f312824f = finderRecordTemplatePluginLayout;
        }

        public final Object invokeSuspend(Object obj) {
            this.f312823e = obj;
            this.f312825g |= Integer.MIN_VALUE;
            return this.f312824f.mo149730b(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {449, 450}, mo125471m = "glRender")
    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$c */
    public static final class C105292c extends C66704d {

        /* renamed from: d */
        public Object f312826d;

        /* renamed from: e */
        public /* synthetic */ Object f312827e;

        /* renamed from: f */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312828f;

        /* renamed from: g */
        public int f312829g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105292c(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, C15601d<? super C105292c> dVar) {
            super(dVar);
            this.f312828f = finderRecordTemplatePluginLayout;
        }

        public final Object invokeSuspend(Object obj) {
            this.f312827e = obj;
            this.f312829g |= Integer.MIN_VALUE;
            return this.f312828f.mo149729a((C110194c) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$d */
    public static final class C105293d extends C87413o implements C32224a<C103766u> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105293d(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout) {
            super(0);
            this.f312830d = finderRecordTemplatePluginLayout;
        }

        public Object invoke() {
            return new C103766u(this.f312830d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$statusChange$1", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {177, 178, 181, 191, 192, 197, 201, 209, 210, 215, 219, 225, 228, 241, 267, 270, 275, 281, 287, 290}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$e */
    public static final class C105294e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f312831d;

        /* renamed from: e */
        public int f312832e;

        /* renamed from: f */
        public final /* synthetic */ C101198e.C101199b f312833f;

        /* renamed from: g */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312834g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f312835h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$statusChange$1$3", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$e$a */
        public static final class C93752a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FinderRecordTemplatePluginLayout f270603d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93752a(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, C15601d<? super C93752a> dVar) {
                super(2, dVar);
                this.f270603d = finderRecordTemplatePluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C93752a(this.f270603d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C93752a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                if (!this.f270603d.mo78564e()) {
                    Context context = this.f270603d.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
                    ((MMRecordUI) context).mo129783I7();
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105294e(C101198e.C101199b bVar, FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, Bundle bundle, C15601d<? super C105294e> dVar) {
            super(2, dVar);
            this.f312833f = bVar;
            this.f312834g = finderRecordTemplatePluginLayout;
            this.f312835h = bundle;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105294e(this.f312833f, this.f312834g, this.f312835h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105294e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b6, code lost:
            r0 = (ia0.C60263l) r0;
            r1 = r7.f312834g.f312813u;
            r7.f312831d = r0;
            r7.f312832e = 5;
            r1.getClass();
            r2 = a14.C53872d1.f151117a;
            r1 = a14.C53895h.m60469g(f14.C58901s.f168555a, new to1.C64975l(r1, (wx3.C15601d<? super to1.C64975l>) null), r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d1, code lost:
            if (r1 != r8) goto L_0x02d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d4, code lost:
            r1 = rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d6, code lost:
            if (r1 != r8) goto L_0x02d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d8, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d9, code lost:
            r1 = r0.f171805a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dc, code lost:
            if (r1 == -4) goto L_0x032b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02de, code lost:
            if (r1 == 0) goto L_0x02e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e2, code lost:
            r1 = ja0.C60784e.f173126a;
            r2 = r0.f171806b;
            gy3.C87412m.m108591d(r2);
            ja0.C60784e.f173129d = a14.C53895h.m60466d(ja0.C60784e.f173127b, (wx3.C66212f) null, (a14.C53934p0) null, new ja0.C60782c(ja0.C60784e.f173129d, r2, (wx3.C15601d<? super ja0.C60782c>) null), 3, (java.lang.Object) null);
            r1.mo85717b(3);
            r1 = r7.f312834g;
            r7.f312831d = r0;
            r7.f312832e = 6;
            r2 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0310, code lost:
            if (r1.mo149738w(true, (android.view.Surface) null, r7) != r8) goto L_0x0313;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0312, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0313, code lost:
            r1 = r7.f312834g;
            r3 = r0.f171806b;
            gy3.C87412m.m108591d(r3);
            r2 = sx3.C64197v.m75534c(r3);
            r0 = r0.f171807c;
            r3 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z;
            r1.mo149737t(r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x032b, code lost:
            r0 = r7.f312834g.f312813u;
            r7.f312831d = null;
            r7.f312832e = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0338, code lost:
            if (r0.mo89131b(r7) != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x033a, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x034a, code lost:
            r0 = (rx3.C13604l) r0;
            r7.f312834g.f312809q.reset();
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "stopRecord result:" + ((java.lang.Number) r0.f38555d).intValue() + " info:" + r0.f38556e);
            r1 = ((java.lang.Number) r0.f38555d).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0381, code lost:
            if (r1 == -4) goto L_0x03bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0383, code lost:
            if (r1 == 0) goto L_0x0387;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0387, code lost:
            r1 = r7.f312834g.f312813u;
            r0 = r0.f38556e;
            gy3.C87412m.m108591d(r0);
            r0 = ((h90.C98324b) r0).f288180a;
            r1.getClass();
            gy3.C87412m.m108594g(r0, "path");
            r1.f187052g.mo86088a(r0, true);
            r0 = r7.f312834g.f312813u;
            r7.f312832e = 12;
            r0.getClass();
            r1 = a14.C53872d1.f151117a;
            r0 = a14.C53895h.m60469g(f14.C58901s.f168555a, new to1.C64974k(r0, (wx3.C15601d<? super to1.C64974k>) null), r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b7, code lost:
            if (r0 != r8) goto L_0x03ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ba, code lost:
            r0 = rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x03bc, code lost:
            if (r0 != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x03be, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x03bf, code lost:
            r0 = r7.f312834g.f312813u;
            r7.f312832e = 13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x03cb, code lost:
            if (r0.mo89131b(r7) != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x03cd, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x03db, code lost:
            r0 = (rx3.C13604l) r0;
            r1 = r7.f312834g.f312813u;
            r7.f312831d = r0;
            r7.f312832e = 9;
            r1.getClass();
            r2 = a14.C53872d1.f151117a;
            r1 = a14.C53895h.m60469g(f14.C58901s.f168555a, new to1.C64971h(r1, (wx3.C15601d<? super to1.C64971h>) null), r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f7, code lost:
            if (r1 != r8) goto L_0x03fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03fa, code lost:
            r1 = rx3.C13598b0.f38549a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fc, code lost:
            if (r1 != r8) goto L_0x03ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fe, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03ff, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "stopRecord resurlt:" + ((java.lang.Number) r0.f38555d).intValue() + " info:" + r0.f38556e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x042c, code lost:
            if (((java.lang.Number) r0.f38555d).intValue() != 0) goto L_0x0448;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x042e, code lost:
            r1 = r7.f312834g;
            r0 = r0.f38556e;
            gy3.C87412m.m108591d(r0);
            r0 = sx3.C64197v.m75534c(((h90.C98324b) r0).f288180a);
            r2 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z;
            r1.mo149737t(r0, (te3.C64237ap1) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0451, code lost:
            if (((java.lang.Number) r0.f38555d).intValue() != -4) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0453, code lost:
            r0 = r7.f312834g.f312813u;
            r7.f312831d = null;
            r7.f312832e = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0461, code lost:
            if (r0.mo89131b(r7) != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0463, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x049d, code lost:
            r0 = r7.f312834g;
            r1 = r0.f312814v;
            r2 = so1.C36752a.f97621a;
            r0 = r0.f312807o;
            gy3.C87412m.m108594g(r0, "session");
            r3 = hi2.C32925e.f89499a;
            r4 = r3.mo58861a("mj" + r0);
            com.tencent.p014mm.vfs.C86013q1.m106445f(r4);
            r3.mo58861a("mj" + r0);
            r0 = ((h81.C32735h) di3.C86312j.m106911c(h81.C32735h.class)).Y60(h81.C32735h.C32737c.clicfg_template_record_security_config, so1.C36752a.f97621a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ec, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x04ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
            r3 = new org.json.JSONObject(r0);
            r0 = com.tencent.maas.instamovie.mediafoundation.DimensionLevel.valueOf(r3.optInt(com.google.firebase.analytics.FirebaseAnalytics.C113379b.LEVEL, com.tencent.maas.instamovie.mediafoundation.DimensionLevel.DIMENSION_LEVEL_360.getId()));
            r5 = r3.optDouble("interval", 3.0d);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.RecordTemplateConfig", "getMJAuditCaptureSettings level:" + r0 + " interval:" + r5 + " dir:" + r4);
            r16 = new com.tencent.maas.camerafun.MJAuditCaptureSettings(r0, r5, com.tencent.maas.camerafun.MJAuditCaptureSettings.MJAuditCaptureOutputType.JPEGs, r4, "mjScy");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0542, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0543, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.RecordTemplateConfig", r0, "getMJAuditCaptureSettings error", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0572, code lost:
            r0 = r7.f312834g;
            r1 = r0.f312812t.f291643f;
            r2 = ((-r1) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0581, code lost:
            if (((r1 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % 180) == 0) goto L_0x0585;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0583, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0585, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0586, code lost:
            r0.f312809q.mo162059k(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0159, code lost:
            if (gy3.C87412m.m108589b(r0.f139919d, "empty") == false) goto L_0x016f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x015b, code lost:
            r7.f312834g.f312813u.mo89133d(true);
            r0 = r7.f312834g;
            r7.f312831d = null;
            r7.f312832e = 16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x016c, code lost:
            if (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.m141384q(r0, r7) != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x016e, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
            r1 = uo1.C14267a.f39802a;
            r2 = r0.f139919d;
            gy3.C87412m.m108593f(r2, "template.id");
            r1.mo13637b("shooting_template", r2);
            r7.f312834g.f312813u.mo89133d(false);
            r1 = r7.f312834g;
            r2 = r1.f312814v;
            r0 = r0.f139919d;
            r1 = r1.f312810r;
            r7.f312831d = null;
            r7.f312832e = 17;
            r0 = r2.mo158987i(r0, r1, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0198, code lost:
            if (r0 != r8) goto L_0x019b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x019a, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
            r0 = (android.view.Surface) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x019d, code lost:
            if (r0 == null) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x019f, code lost:
            r1 = r7.f312834g;
            r1.f312815w.f332526n = false;
            r2 = r1.f312814v.f324706p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a9, code lost:
            if (r2 == null) goto L_0x01b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ab, code lost:
            r2 = r2.getMaxRecordingDuration();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01af, code lost:
            if (r2 == null) goto L_0x01b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b1, code lost:
            r2 = (int) r2.toMilliseconds();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b7, code lost:
            r2 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b8, code lost:
            if (r2 <= 0) goto L_0x01bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ba, code lost:
            r1.f312813u.mo89135g(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
            r7.f312832e = 18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c5, code lost:
            if (r1.mo149738w(false, r0, r7) != r8) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c7, code lost:
            return r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fa, code lost:
            r0 = (rx3.C13604l) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0204, code lost:
            if (((java.lang.Number) r0.f38555d).intValue() != 0) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0206, code lost:
            r1 = r7.f312834g.f312817y;
            gy3.C87412m.m108591d(r1);
            r1 = r1.f272903D;
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage((android.graphics.Bitmap) r0.f38556e, 100, android.graphics.Bitmap.CompressFormat.JPEG, r1, true);
            r0 = r7.f312834g;
            gy3.C87412m.m108593f(r1, "path");
            r2 = r0.f312817y;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0221, code lost:
            if (r2 == null) goto L_0x0226;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0223, code lost:
            r2 = r2.f272912M;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
            if (r2 != null) goto L_0x022e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0229, code lost:
            r2 = new android.os.Bundle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x022e, code lost:
            r2.putParcelableArrayList("media_list", sx3.C64197v.m75534c(com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(1, 0, r1, "", "")));
            r3 = r0.f312817y;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x024a, code lost:
            if (r3 != null) goto L_0x024d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x024d, code lost:
            r3.f272912M = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x024f, code lost:
            r15 = new h90.C98324b((java.lang.String) null, (java.lang.String) null, true, 0, 0, (java.lang.String) null, (java.lang.String) null, 0, 0, r1, (java.util.ArrayList) null, (java.util.ArrayList) null, false, (android.os.Bundle) null, (android.graphics.Rect) null, 0, 65019, (gy3.C8480h) null);
            r0 = r0.f312816x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x027c, code lost:
            if (r0 == null) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x027e, code lost:
            r0.mo142012b(1, r15);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                r34 = this;
                r7 = r34
                xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r7.f312832e
                r1 = 5
                r9 = 16
                r10 = 18
                r11 = 0
                r12 = 0
                r13 = 1
                java.lang.String r14 = "path"
                java.lang.String r3 = " info:"
                r4 = 6
                java.lang.String r5 = "MicroMsg.FinderRecordTemplatePluginLayout"
                r6 = 3
                r15 = 2
                switch(r0) {
                    case 0: goto L_0x0078;
                    case 1: goto L_0x0073;
                    case 2: goto L_0x006e;
                    case 3: goto L_0x0069;
                    case 4: goto L_0x0062;
                    case 5: goto L_0x0059;
                    case 6: goto L_0x0050;
                    case 7: goto L_0x006e;
                    case 8: goto L_0x0049;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x006e;
                    case 11: goto L_0x0039;
                    case 12: goto L_0x006e;
                    case 13: goto L_0x006e;
                    case 14: goto L_0x0032;
                    case 15: goto L_0x0029;
                    case 16: goto L_0x006e;
                    case 17: goto L_0x0022;
                    case 18: goto L_0x006e;
                    case 19: goto L_0x006e;
                    case 20: goto L_0x006e;
                    default: goto L_0x001a;
                }
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r35)
                r0 = r35
                goto L_0x019b
            L_0x0029:
                java.lang.Object r0 = r7.f312831d
                te3.pr4 r0 = (te3.pr4) r0
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x0151
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r35)
                r0 = r35
                goto L_0x01fa
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r35)
                r0 = r35
                goto L_0x034a
            L_0x0040:
                java.lang.Object r0 = r7.f312831d
                rx3.l r0 = (rx3.C13604l) r0
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x03ff
            L_0x0049:
                kotlin.ResultKt.throwOnFailure(r35)
                r0 = r35
                goto L_0x03db
            L_0x0050:
                java.lang.Object r0 = r7.f312831d
                ia0.l r0 = (ia0.C60263l) r0
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x0313
            L_0x0059:
                java.lang.Object r0 = r7.f312831d
                ia0.l r0 = (ia0.C60263l) r0
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x02d9
            L_0x0062:
                kotlin.ResultKt.throwOnFailure(r35)
                r0 = r35
                goto L_0x02b6
            L_0x0069:
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x0572
            L_0x006e:
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x05ad
            L_0x0073:
                kotlin.ResultKt.throwOnFailure(r35)
                goto L_0x049d
            L_0x0078:
                kotlin.ResultKt.throwOnFailure(r35)
                qh2.e$b r0 = r7.f312833f
                int r0 = r0.ordinal()
                if (r0 == r13) goto L_0x0594
                if (r0 == r15) goto L_0x058c
                java.lang.String r2 = ""
                if (r0 == r1) goto L_0x0464
                r1 = 8
                if (r0 == r4) goto L_0x0298
                if (r0 == r1) goto L_0x0283
                r1 = 14
                if (r0 == r1) goto L_0x01e1
                r1 = 144(0x90, float:2.02E-43)
                if (r0 == r1) goto L_0x01cb
                r1 = 140(0x8c, float:1.96E-43)
                java.lang.String r3 = "exportTemplateId"
                if (r0 == r1) goto L_0x00d1
                r1 = 141(0x8d, float:1.98E-43)
                if (r0 == r1) goto L_0x00ba
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unknown status "
                r0.append(r1)
                qh2.e$b r1 = r7.f312833f
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                goto L_0x05ad
            L_0x00ba:
                ja0.e r0 = ja0.C60784e.f173126a
                com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct r0 = ja0.C60784e.f173128c
                java.lang.String r1 = r0.mo86045b(r3, r2, r13)
                r0.f156487n = r1
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                r1 = 19
                r7.f312832e = r1
                java.lang.Object r0 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.m141384q(r0, r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x00d1:
                android.os.Bundle r0 = r7.f312835h
                if (r0 == 0) goto L_0x01c8
                java.lang.String r1 = "PARAM_1_BYTEARRAY"
                byte[] r0 = r0.getByteArray(r1)
                if (r0 != 0) goto L_0x00df
                goto L_0x01c8
            L_0x00df:
                te3.pr4 r1 = new te3.pr4
                r1.<init>()
                r1.parseFrom(r0)
                ja0.e r0 = ja0.C60784e.f173126a
                java.lang.String r0 = r1.f139919d
                com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct r2 = ja0.C60784e.f173128c
                java.lang.String r0 = r2.mo86045b(r3, r0, r13)
                r2.f156487n = r0
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                int r2 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z
                boolean r0 = r0.mo149736r()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "RECORD_SWITCH_TEMPLATE:"
                r2.append(r3)
                java.lang.String r3 = r1.f139919d
                r2.append(r3)
                java.lang.String r3 = " name:"
                r2.append(r3)
                te3.vy r3 = r1.f139922g
                java.lang.String r3 = r3.f143760d
                r2.append(r3)
                java.lang.String r3 = ", isCurrentCameraScreenOutput:"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                te3.vy r2 = r1.f139922g
                java.lang.String r2 = r2.f143760d
                r7.f312831d = r1
                r3 = 15
                r7.f312832e = r3
                r0.getClass()
                if (r2 != 0) goto L_0x013b
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x014d
            L_0x013b:
                a14.h0 r3 = a14.C53872d1.f151117a
                a14.k2 r3 = f14.C58901s.f168555a
                to1.n r4 = new to1.n
                r4.<init>(r0, r2, r12)
                java.lang.Object r0 = a14.C53895h.m60469g(r3, r4, r7)
                if (r0 != r8) goto L_0x014b
                goto L_0x014d
            L_0x014b:
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x014d:
                if (r0 != r8) goto L_0x0150
                return r8
            L_0x0150:
                r0 = r1
            L_0x0151:
                java.lang.String r1 = r0.f139919d
                java.lang.String r2 = "empty"
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 == 0) goto L_0x016f
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r0.mo89133d(r13)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                r7.f312831d = r12
                r7.f312832e = r9
                java.lang.Object r0 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.m141384q(r0, r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x016f:
                uo1.a r1 = uo1.C14267a.f39802a
                java.lang.String r2 = r0.f139919d
                java.lang.String r3 = "template.id"
                gy3.C87412m.m108593f(r2, r3)
                java.lang.String r3 = "shooting_template"
                r1.mo13637b(r3, r2)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                to1.d r1 = r1.f312813u
                r1.mo89133d(r11)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                ia0.c r2 = r1.f312814v
                java.lang.String r0 = r0.f139919d
                i80.c r1 = r1.f312810r
                r7.f312831d = r12
                r3 = 17
                r7.f312832e = r3
                java.lang.Object r0 = r2.mo158987i(r0, r1, r7)
                if (r0 != r8) goto L_0x019b
                return r8
            L_0x019b:
                android.view.Surface r0 = (android.view.Surface) r0
                if (r0 == 0) goto L_0x05ad
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                to1.a r2 = r1.f312815w
                r2.f332526n = r11
                ia0.c r2 = r1.f312814v
                com.tencent.maas.camerafun.MJCaptureOptions r2 = r2.f324706p
                if (r2 == 0) goto L_0x01b7
                com.tencent.maas.model.time.MJTime r2 = r2.getMaxRecordingDuration()
                if (r2 == 0) goto L_0x01b7
                double r2 = r2.toMilliseconds()
                int r2 = (int) r2
                goto L_0x01b8
            L_0x01b7:
                r2 = -1
            L_0x01b8:
                if (r2 <= 0) goto L_0x01bf
                to1.d r3 = r1.f312813u
                r3.mo89135g(r2)
            L_0x01bf:
                r7.f312832e = r10
                java.lang.Object r0 = r1.mo149738w(r11, r0, r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x01c8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x01cb:
                a14.h0 r0 = a14.C53872d1.f151117a
                a14.k2 r0 = f14.C58901s.f168555a
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$e$a r1 = new com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$e$a
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r2 = r7.f312834g
                r1.<init>(r2, r12)
                r2 = 20
                r7.f312832e = r2
                java.lang.Object r0 = a14.C53895h.m60469g(r0, r1, r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x01e1:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                i80.c r2 = r0.f312810r
                lh2.w0 r0 = r0.f312812t
                int r4 = r0.f291643f
                r5 = 0
                r7.f312832e = r1
                r0 = 0
                r3 = 1920(0x780, float:2.69E-42)
                r1 = r2
                r2 = r0
                r6 = r34
                java.lang.Object r0 = r1.mo148268f(r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x01fa
                return r8
            L_0x01fa:
                rx3.l r0 = (rx3.C13604l) r0
                A r1 = r0.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x05ad
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r1.f312817y
                gy3.C87412m.m108591d(r1)
                java.lang.String r1 = r1.f272903D
                B r0 = r0.f38556e
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                r2 = 100
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r2, r3, r1, r13)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                gy3.C87412m.m108593f(r1, r14)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r0.f312817y
                if (r2 == 0) goto L_0x0226
                android.os.Bundle r2 = r2.f272912M
                goto L_0x0227
            L_0x0226:
                r2 = r12
            L_0x0227:
                if (r2 != 0) goto L_0x022e
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
            L_0x022e:
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[] r3 = new com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem[r13]
                r15 = 1
                r16 = 0
                java.lang.String r19 = ""
                java.lang.String r20 = ""
                r18 = r1
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r15, r16, r18, r19, r20)
                r3[r11] = r4
                java.util.ArrayList r3 = sx3.C64197v.m75534c(r3)
                java.lang.String r4 = "media_list"
                r2.putParcelableArrayList(r4, r3)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f312817y
                if (r3 != 0) goto L_0x024d
                goto L_0x024f
            L_0x024d:
                r3.f272912M = r2
            L_0x024f:
                h90.b r2 = new h90.b
                r15 = r2
                r16 = 0
                r17 = 0
                r18 = 1
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 65019(0xfdfb, float:9.1111E-41)
                r33 = 0
                r25 = r1
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                wg2.a r0 = r0.f312816x
                if (r0 == 0) goto L_0x05ad
                r0.mo142012b(r13, r2)
                goto L_0x05ad
            L_0x0283:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r1 = r0.f312813u
                kr1.q r1 = r1.f187052g
                r1.getClass()
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.ArrayList<java.lang.String> r1 = r1.f174085d
                r2.<init>(r1)
                r0.mo149737t(r2, r12)
                goto L_0x05ad
            L_0x0298:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                int r0 = r0.mo89130a()
                if (r0 == r13) goto L_0x03ce
                if (r0 == r15) goto L_0x033b
                if (r0 == r6) goto L_0x02a8
                goto L_0x05ad
            L_0x02a8:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                ia0.c r0 = r0.f312814v
                r1 = 4
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo158985g(r7)
                if (r0 != r8) goto L_0x02b6
                return r8
            L_0x02b6:
                ia0.l r0 = (ia0.C60263l) r0
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                to1.d r1 = r1.f312813u
                r7.f312831d = r0
                r2 = 5
                r7.f312832e = r2
                r1.getClass()
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r2 = f14.C58901s.f168555a
                to1.l r3 = new to1.l
                r3.<init>(r1, r12)
                java.lang.Object r1 = a14.C53895h.m60469g(r2, r3, r7)
                if (r1 != r8) goto L_0x02d4
                goto L_0x02d6
            L_0x02d4:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x02d6:
                if (r1 != r8) goto L_0x02d9
                return r8
            L_0x02d9:
                int r1 = r0.f171805a
                r2 = -4
                if (r1 == r2) goto L_0x032b
                if (r1 == 0) goto L_0x02e2
                goto L_0x05ad
            L_0x02e2:
                ja0.e r1 = ja0.C60784e.f173126a
                java.lang.String r2 = r0.f171806b
                gy3.C87412m.m108591d(r2)
                a14.z1 r3 = ja0.C60784e.f173129d
                a14.n0 r14 = ja0.C60784e.f173127b
                ja0.c r5 = new ja0.c
                r5.<init>(r3, r2, r12)
                r16 = 0
                r18 = 3
                r19 = 0
                r15 = 0
                r17 = r5
                a14.z1 r2 = a14.C53895h.m60466d(r14, r15, r16, r17, r18, r19)
                ja0.C60784e.f173129d = r2
                r1.mo85717b(r6)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                r7.f312831d = r0
                r7.f312832e = r4
                int r2 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z
                java.lang.Object r1 = r1.mo149738w(r13, r12, r7)
                if (r1 != r8) goto L_0x0313
                return r8
            L_0x0313:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                java.lang.String[] r2 = new java.lang.String[r13]
                java.lang.String r3 = r0.f171806b
                gy3.C87412m.m108591d(r3)
                r2[r11] = r3
                java.util.ArrayList r2 = sx3.C64197v.m75534c(r2)
                te3.ap1 r0 = r0.f171807c
                int r3 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z
                r1.mo149737t(r2, r0)
                goto L_0x05ad
            L_0x032b:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r7.f312831d = r12
                r1 = 7
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo89131b(r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x033b:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                rh2.b r0 = r0.f312809q
                r1 = 11
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo162060l(r7)
                if (r0 != r8) goto L_0x034a
                return r8
            L_0x034a:
                rx3.l r0 = (rx3.C13604l) r0
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                rh2.b r1 = r1.f312809q
                r1.reset()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "stopRecord result:"
                r1.append(r2)
                A r2 = r0.f38555d
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r1.append(r2)
                r1.append(r3)
                B r2 = r0.f38556e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                A r1 = r0.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = -4
                if (r1 == r2) goto L_0x03bf
                if (r1 == 0) goto L_0x0387
                goto L_0x05ad
            L_0x0387:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                to1.d r1 = r1.f312813u
                B r0 = r0.f38556e
                gy3.C87412m.m108591d(r0)
                h90.b r0 = (h90.C98324b) r0
                java.lang.String r0 = r0.f288180a
                r1.getClass()
                gy3.C87412m.m108594g(r0, r14)
                kr1.q r1 = r1.f187052g
                r1.mo86088a(r0, r13)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r1 = 12
                r7.f312832e = r1
                r0.getClass()
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                to1.k r2 = new to1.k
                r2.<init>(r0, r12)
                java.lang.Object r0 = a14.C53895h.m60469g(r1, r2, r7)
                if (r0 != r8) goto L_0x03ba
                goto L_0x03bc
            L_0x03ba:
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x03bc:
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x03bf:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r1 = 13
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo89131b(r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x03ce:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                rh2.b r0 = r0.f312809q
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo162060l(r7)
                if (r0 != r8) goto L_0x03db
                return r8
            L_0x03db:
                rx3.l r0 = (rx3.C13604l) r0
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                to1.d r1 = r1.f312813u
                r7.f312831d = r0
                r2 = 9
                r7.f312832e = r2
                r1.getClass()
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r2 = f14.C58901s.f168555a
                to1.h r4 = new to1.h
                r4.<init>(r1, r12)
                java.lang.Object r1 = a14.C53895h.m60469g(r2, r4, r7)
                if (r1 != r8) goto L_0x03fa
                goto L_0x03fc
            L_0x03fa:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x03fc:
                if (r1 != r8) goto L_0x03ff
                return r8
            L_0x03ff:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "stopRecord resurlt:"
                r1.append(r2)
                A r2 = r0.f38555d
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r1.append(r2)
                r1.append(r3)
                B r2 = r0.f38556e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                A r1 = r0.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x0448
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                java.lang.String[] r2 = new java.lang.String[r13]
                B r0 = r0.f38556e
                gy3.C87412m.m108591d(r0)
                h90.b r0 = (h90.C98324b) r0
                java.lang.String r0 = r0.f288180a
                r2[r11] = r0
                java.util.ArrayList r0 = sx3.C64197v.m75534c(r2)
                int r2 = com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.f312806z
                r1.mo149737t(r0, r12)
                goto L_0x05ad
            L_0x0448:
                A r0 = r0.f38555d
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r1 = -4
                if (r0 != r1) goto L_0x05ad
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r7.f312831d = r12
                r1 = 10
                r7.f312832e = r1
                java.lang.Object r0 = r0.mo89131b(r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x0464:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                int r0 = r0.mo89130a()
                if (r0 != r6) goto L_0x0554
                uo1.a r0 = uo1.C14267a.f39802a
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                ia0.c r1 = r1.f312814v
                java.lang.String r1 = r1.f324707q
                if (r1 != 0) goto L_0x0479
                goto L_0x047a
            L_0x0479:
                r2 = r1
            L_0x047a:
                java.lang.String r1 = "btn_start_shooting"
                r0.mo13637b(r1, r2)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r7.f312832e = r13
                r0.getClass()
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                to1.m r2 = new to1.m
                r2.<init>(r0, r12)
                java.lang.Object r0 = a14.C53895h.m60469g(r1, r2, r7)
                if (r0 != r8) goto L_0x0498
                goto L_0x049a
            L_0x0498:
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x049a:
                if (r0 != r8) goto L_0x049d
                return r8
            L_0x049d:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                ia0.c r1 = r0.f312814v
                java.lang.String r2 = so1.C36752a.f97621a
                java.lang.String r0 = r0.f312807o
                java.lang.String r2 = "MicroMsg.RecordTemplateConfig"
                java.lang.String r3 = "session"
                gy3.C87412m.m108594g(r0, r3)
                hi2.e r3 = hi2.C32925e.f89499a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "mj"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r3.mo58861a(r4)
                com.tencent.p014mm.vfs.C86013q1.m106445f(r4)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r3.mo58861a(r0)
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r3 = h81.C32735h.C32737c.clicfg_template_record_security_config
                java.lang.String r5 = so1.C36752a.f97621a
                java.lang.String r0 = r0.Y60(r3, r5)
                boolean r3 = android.text.TextUtils.isEmpty(r0)
                if (r3 == 0) goto L_0x04ef
                goto L_0x054a
            L_0x04ef:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0542 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0542 }
                java.lang.String r0 = "level"
                com.tencent.maas.instamovie.mediafoundation.DimensionLevel r5 = com.tencent.maas.instamovie.mediafoundation.DimensionLevel.DIMENSION_LEVEL_360     // Catch:{ Exception -> 0x0542 }
                int r5 = r5.getId()     // Catch:{ Exception -> 0x0542 }
                int r0 = r3.optInt(r0, r5)     // Catch:{ Exception -> 0x0542 }
                com.tencent.maas.instamovie.mediafoundation.DimensionLevel r0 = com.tencent.maas.instamovie.mediafoundation.DimensionLevel.valueOf((int) r0)     // Catch:{ Exception -> 0x0542 }
                java.lang.String r5 = "interval"
                r13 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r5 = r3.optDouble(r5, r13)     // Catch:{ Exception -> 0x0542 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0542 }
                r3.<init>()     // Catch:{ Exception -> 0x0542 }
                java.lang.String r13 = "getMJAuditCaptureSettings level:"
                r3.append(r13)     // Catch:{ Exception -> 0x0542 }
                r3.append(r0)     // Catch:{ Exception -> 0x0542 }
                java.lang.String r13 = " interval:"
                r3.append(r13)     // Catch:{ Exception -> 0x0542 }
                r3.append(r5)     // Catch:{ Exception -> 0x0542 }
                java.lang.String r13 = " dir:"
                r3.append(r13)     // Catch:{ Exception -> 0x0542 }
                r3.append(r4)     // Catch:{ Exception -> 0x0542 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0542 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0542 }
                com.tencent.maas.camerafun.MJAuditCaptureSettings r3 = new com.tencent.maas.camerafun.MJAuditCaptureSettings     // Catch:{ Exception -> 0x0542 }
                com.tencent.maas.camerafun.MJAuditCaptureSettings$MJAuditCaptureOutputType r20 = com.tencent.maas.camerafun.MJAuditCaptureSettings.MJAuditCaptureOutputType.JPEGs     // Catch:{ Exception -> 0x0542 }
                java.lang.String r22 = "mjScy"
                r16 = r3
                r17 = r0
                r18 = r5
                r21 = r4
                r16.<init>(r17, r18, r20, r21, r22)     // Catch:{ Exception -> 0x0542 }
                goto L_0x054b
            L_0x0542:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r11]
                java.lang.String r4 = "getMJAuditCaptureSettings error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            L_0x054a:
                r3 = r12
            L_0x054b:
                r7.f312832e = r15
                java.lang.Object r0 = r1.mo158984f(r3, r7)
                if (r0 != r8) goto L_0x05ad
                return r8
            L_0x0554:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                r7.f312832e = r6
                r0.getClass()
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                to1.i r2 = new to1.i
                r2.<init>(r0, r12)
                java.lang.Object r0 = a14.C53895h.m60469g(r1, r2, r7)
                if (r0 != r8) goto L_0x056d
                goto L_0x056f
            L_0x056d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x056f:
                if (r0 != r8) goto L_0x0572
                return r8
            L_0x0572:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                lh2.w0 r1 = r0.f312812t
                int r1 = r1.f291643f
                int r2 = -r1
                int r2 = r2 + 360
                int r2 = r2 % 360
                int r1 = r1 + 360
                int r1 = r1 % 180
                if (r1 == 0) goto L_0x0585
                r1 = 1
                goto L_0x0586
            L_0x0585:
                r1 = 0
            L_0x0586:
                rh2.b r0 = r0.f312809q
                r0.mo162059k(r2, r1)
                goto L_0x05ad
            L_0x058c:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                i80.c r0 = r0.f312810r
                r0.switchCamera()
                goto L_0x05ad
            L_0x0594:
                android.os.Bundle r0 = r7.f312835h
                if (r0 == 0) goto L_0x05ad
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r1 = r7.f312834g
                java.lang.String r2 = "PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN"
                boolean r0 = r0.getBoolean(r2, r11)
                if (r0 == 0) goto L_0x05a8
                i80.c r0 = r1.f312810r
                r0.mo148263a()
                goto L_0x05ad
            L_0x05a8:
                i80.c r0 = r1.f312810r
                r0.mo148264b()
            L_0x05ad:
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.d r0 = r0.f312813u
                qh2.e$b r1 = r7.f312833f
                android.os.Bundle r2 = r7.f312835h
                r0.getClass()
                java.lang.String r3 = "status"
                gy3.C87412m.m108594g(r1, r3)
                com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout r13 = r0.f187049d
                a14.h0 r4 = a14.C53872d1.f151117a
                a14.k2 r14 = f14.C58901s.f168555a
                r15 = 0
                to1.j r4 = new to1.j
                r4.<init>(r1, r2, r0, r12)
                r17 = 2
                r18 = 0
                r16 = r4
                com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout.m119451m(r13, r14, r15, r16, r17, r18)
                com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r0 = r7.f312834g
                to1.a r0 = r0.f312815w
                qh2.e$b r1 = r7.f312833f
                android.os.Bundle r2 = r7.f312835h
                r0.getClass()
                gy3.C87412m.m108594g(r1, r3)
                int r1 = r1.ordinal()
                if (r1 == r9) goto L_0x0600
                if (r1 == r10) goto L_0x05ea
                goto L_0x0613
            L_0x05ea:
                if (r2 == 0) goto L_0x0613
                java.lang.String r1 = "PARAM_BEAUTIFY_CONFIG"
                android.os.Parcelable r1 = r2.getParcelable(r1)
                com.tencent.mm.plugin.xlabeffect.XEffectConfig r1 = (com.tencent.p014mm.plugin.xlabeffect.XEffectConfig) r1
                if (r1 == 0) goto L_0x0613
                to1.c r2 = new to1.c
                r2.<init>(r0, r1)
                r1 = 1
                g80.C107766b.m146002f(r0, r11, r2, r1, r12)
                goto L_0x0613
            L_0x0600:
                r1 = 1
                if (r2 == 0) goto L_0x060a
                java.lang.String r3 = "PARAM_BEAUTIFY_ENABLE"
                boolean r2 = r2.getBoolean(r3)
                goto L_0x060b
            L_0x060a:
                r2 = 0
            L_0x060b:
                to1.b r3 = new to1.b
                r3.<init>(r0, r2)
                g80.C107766b.m146002f(r0, r11, r3, r1, r12)
            L_0x0613:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105294e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$toggleCameraScreenOutput$2", mo125469f = "FinderRecordTemplatePluginLayout.kt", mo125470l = {316}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$f */
    public static final class C105295f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f312836d;

        /* renamed from: e */
        public final /* synthetic */ boolean f312837e;

        /* renamed from: f */
        public final /* synthetic */ Surface f312838f;

        /* renamed from: g */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312839g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105295f(boolean z, Surface surface, FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, C15601d<? super C105295f> dVar) {
            super(2, dVar);
            this.f312837e = z;
            this.f312838f = surface;
            this.f312839g = finderRecordTemplatePluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105295f(this.f312837e, this.f312838f, this.f312839g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105295f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f312836d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "toggleCameraScreenOutput show:" + this.f312837e + ", surface:" + this.f312838f);
                Surface surface = this.f312838f;
                if (surface != null && !this.f312837e) {
                    FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout = this.f312839g;
                    finderRecordTemplatePluginLayout.f312810r.mo148277m(surface, new Integer(finderRecordTemplatePluginLayout.f312814v.f324711u.f324764b.f320920a), new Integer(this.f312839g.f312814v.f324711u.f324764b.f320921b));
                    C108438c cVar = this.f312839g.f312814v;
                    this.f312836d = 1;
                    if (cVar.mo158989k(true, true, this) == aVar) {
                        return aVar;
                    }
                } else if (this.f312837e) {
                    this.f312839g.f312810r.mo148266d();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C108400c cVar2 = this.f312839g.f312810r;
            C87412m.m108592e(cVar2, "null cannot be cast to non-null type android.view.View");
            View view = (View) cVar2;
            int i2 = this.f312837e ? 0 : 4;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i2));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/record/FinderRecordTemplatePluginLayout$toggleCameraScreenOutput$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/record/FinderRecordTemplatePluginLayout$toggleCameraScreenOutput$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$g */
    public static final class C105296g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordTemplatePluginLayout f312840d;

        public C105296g(FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout) {
            this.f312840d = finderRecordTemplatePluginLayout;
        }

        public final void run() {
            FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout = this.f312840d;
            int i = FinderRecordTemplatePluginLayout.f312806z;
            finderRecordTemplatePluginLayout.setCheckAudioPermission(true);
            Context context = this.f312840d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRecordTemplatePluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C99471w0 w0Var = new C99471w0(context);
        this.f312812t = w0Var;
        this.f312815w = new C111040a(this);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.clq, this, true);
        setBackgroundColor(-16777216);
        View findViewById = findViewById(C0966R.C0970id.apr);
        C87412m.m108593f(findViewById, "findViewById(R.id.camera_view)");
        C108400c cVar = (C108400c) findViewById;
        this.f312810r = cVar;
        cVar.mo148275k(this);
        cVar.setCustomRender(this);
        C64963d dVar = new C64963d(this);
        this.f312813u = dVar;
        View findViewById2 = findViewById(C0966R.C0970id.m7x);
        C87412m.m108593f(findViewById2, "findViewById<FrameLayout>(R.id.template_preview)");
        C108438c cVar2 = new C108438c(this, (ViewGroup) findViewById2);
        C108221t.f324032a.getClass();
        C108221t.f324043l = dVar;
        this.f312814v = cVar2;
        View findViewById3 = findViewById(C0966R.C0970id.kaw);
        C87412m.m108593f(findViewById3, "findViewById(R.id.switch_camera)");
        C99473x0 x0Var = new C99473x0((ImageView) findViewById3, this);
        this.f312811s = x0Var;
        w0Var.f291644g = this;
        getPluginList().add(x0Var);
        getPluginList().add(w0Var);
        getPluginList().add(cVar2);
        getPluginList().add(dVar);
    }

    private final C103766u getLifecycleRegistry() {
        return (C103766u) ((C36570n) this.f312808p).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m141384q(com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof ro1.C110574a
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ro1.a r0 = (ro1.C110574a) r0
            int r1 = r0.f330736g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f330736g = r1
            goto L_0x001b
        L_0x0016:
            ro1.a r0 = new ro1.a
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f330734e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f330736g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f330733d
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r5 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006f
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            java.lang.Object r5 = r0.f330733d
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r5 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005c
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r6)
            to1.d r6 = r5.f312813u
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r5.f312817y
            gy3.C87412m.m108591d(r2)
            int r2 = r2.f272935w
            r6.mo89135g(r2)
            r0.f330733d = r5
            r0.f330736g = r4
            r6 = 0
            java.lang.Object r6 = r5.mo149738w(r4, r6, r0)
            if (r6 != r1) goto L_0x005c
            goto L_0x0075
        L_0x005c:
            boolean r6 = r5.mo149736r()
            if (r6 != 0) goto L_0x006f
            ia0.c r6 = r5.f312814v
            r0.f330733d = r5
            r0.f330736g = r3
            java.lang.Object r6 = r6.mo158986h(r0)
            if (r6 != r1) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            to1.a r5 = r5.f312815w
            r5.f332526n = r4
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.m141384q(com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:19:0x0058, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149729a(p80.C110194c r6, wx3.C15601d<? super p80.C110194c> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105292c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$c r0 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105292c) r0
            int r1 = r0.f312829g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f312829g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$c r0 = new com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f312827e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f312829g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005b
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f312826d
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r6 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004b
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            to1.a r7 = r5.f312815w
            r0.f312826d = r5
            r0.f312829g = r4
            java.lang.Object r7 = r7.mo149729a(r6, r0)
            if (r7 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r6 = r5
        L_0x004b:
            p80.c r7 = (p80.C110194c) r7
            rh2.b r6 = r6.f312809q
            r2 = 0
            r0.f312826d = r2
            r0.f312829g = r3
            java.lang.Object r7 = r6.mo149729a(r7, r0)
            if (r7 != r1) goto L_0x005b
            return r1
        L_0x005b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.mo149729a(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149730b(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105291b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$b r0 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105291b) r0
            int r1 = r0.f312825g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f312825g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$b r0 = new com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f312823e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f312825g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f312822d
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r2 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            to1.a r6 = r5.f312815w
            r0.f312822d = r5
            r0.f312825g = r4
            java.lang.Object r6 = r6.mo149730b(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            rh2.b r6 = r2.f312809q
            r2 = 0
            r0.f312822d = r2
            r0.f312825g = r3
            java.lang.Object r6 = r6.mo149730b(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.mo149730b(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!super.mo78564e()) {
            return false;
        }
        C60784e.f173126a.mo85717b(1);
        return true;
    }

    public C39623j getLifecycle() {
        return getLifecycleRegistry();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo149731i(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105290a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$a r0 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.C105290a) r0
            int r1 = r0.f312821g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f312821g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$a r0 = new com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f312819e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f312821g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f312818d
            com.tencent.mm.plugin.finder.record.FinderRecordTemplatePluginLayout r2 = (com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            to1.a r6 = r5.f312815w
            r0.f312818d = r5
            r0.f312821g = r4
            java.lang.Object r6 = r6.mo149731i(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            rh2.b r6 = r2.f312809q
            r2 = 0
            r0.f312818d = r2
            r0.f312821g = r3
            java.lang.Object r6 = r6.mo149731i(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout.mo149731i(wx3.d):java.lang.Object");
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        VideoTransPara videoTransPara = recordConfigProvider.f272926n;
        if (videoTransPara != null) {
            videoTransPara.f267167e = (videoTransPara.f267166d * 16) / 9;
            Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "onResume init SightRecordConfig,fix record size:" + videoTransPara.f267166d + 'x' + videoTransPara.f267167e);
            C97884j.f287164a.mo137210c(videoTransPara, 0, false);
        }
        C102031b.f300466a.mo141540a(recordConfigProvider);
        this.f312816x = aVar;
        this.f312817y = recordConfigProvider;
        C98453h.f288774a.mo137804b(recordConfigProvider);
        this.f312809q.mo162057h(recordConfigProvider, false);
        long j = ((long) ((C36594q) C86312j.m106911c(C36594q.class)).Gu0().f267171i) * 1000;
        C110563b bVar = this.f312809q;
        if (j < 2000) {
            j = 2000;
        }
        bVar.getClass();
        Log.m105924i("MicroMsg.CameraKitRecorder", "setRecordMinTimeMs:" + j);
        bVar.f330705u = j;
        this.f312810r.setCameraKitSetting(new C107259g(new C107260h(C76577a.m92153d(getContext(), C0966R.color.f2939n), false, 2, (C8480h) null), (C107254b) null, new C107258f(recordConfigProvider.f272905F, recordConfigProvider.f272912M.getInt("key_sub_scene", -1))));
        super.mo128671k(aVar, recordConfigProvider);
        C14267a aVar2 = C14267a.f39802a;
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Intent intent = ((Activity) context).getIntent();
        C87412m.m108593f(intent, "context as Activity).intent");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + 1001 + ", field: " + C60781a.f173119b);
        C60781a.f173119b = 1001;
        intent.putExtras(recordConfigProvider.f272912M);
        C14267a.f39804c = new MaasPageFinderReporter((String) ((C36570n) C14267a.f39803b).getValue(), 99, "", intent);
    }

    /* renamed from: n */
    public boolean mo149732n() {
        boolean n = super.mo149732n();
        boolean z = !n;
        this.f312809q.mo162058j(z);
        C108438c cVar = this.f312814v;
        cVar.getClass();
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "setMutePcm:" + z);
        cVar.f324703j = z;
        return n;
    }

    /* renamed from: o */
    public void mo149733o(boolean z) {
        boolean z2 = !z;
        this.f312809q.mo162058j(z2);
        C108438c cVar = this.f312814v;
        cVar.getClass();
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "setMutePcm:" + z2);
        cVar.f324703j = z2;
        C64963d dVar = this.f312813u;
        C105296g gVar = new C105296g(this);
        dVar.getClass();
        if (z) {
            dVar.f187058p.mo160526a();
        } else {
            dVar.f187058p.mo160532h(new C14061o(gVar));
        }
    }

    public void onAttach() {
        super.onAttach();
        C64963d dVar = this.f312813u;
        dVar.f187054i.clearAnimation();
        dVar.f187054i.setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecordConfigProvider recordConfigProvider = this.f312817y;
        if (recordConfigProvider != null) {
            C102031b.f300466a.mo141540a(recordConfigProvider);
            this.f312809q.mo162057h(recordConfigProvider, false);
        }
    }

    public void onDetach() {
        super.onDetach();
        C64963d dVar = this.f312813u;
        dVar.f187054i.clearAnimation();
        dVar.f187054i.setVisibility(4);
    }

    public void onOrientationChange(int i) {
        this.f312811s.mo138906b((float) i);
    }

    public void onPause() {
        Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "onPause");
        C14267a aVar = C14267a.f39802a;
        MaasPageFinderReporter maasPageFinderReporter = C14267a.f39804c;
        if (maasPageFinderReporter != null) {
            maasPageFinderReporter.mo1207g(false, 99, aVar.mo13636a((String) null));
        }
        super.onPause();
        getLifecycleRegistry().mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "onResume");
        C14267a aVar = C14267a.f39802a;
        pr4 pr4 = this.f312813u.f187068z;
        Surface surface = null;
        String str = pr4 != null ? pr4.f139919d : null;
        MaasPageFinderReporter maasPageFinderReporter = C14267a.f39804c;
        boolean z = true;
        if (maasPageFinderReporter != null) {
            maasPageFinderReporter.mo1207g(true, 99, aVar.mo13636a(str));
        }
        super.onResume();
        getLifecycleRegistry().mo145135c(C39623j.C39625b.ON_RESUME);
        if (getCheckAudioPermission()) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            mo149733o(((C103918d) C86312j.m106911c(C103918d.class)).Gd0((Activity) context, "android.permission.RECORD_AUDIO"));
        }
        C108438c cVar = this.f312814v;
        String str2 = cVar.f324707q;
        if (str2 == null || str2.length() == 0) {
            String str3 = cVar.f324708r;
            if (str3 == null || str3.length() == 0) {
                z = false;
            }
        }
        if (z) {
            ImageReader imageReader = this.f312814v.f324701h;
            if (imageReader != null) {
                surface = imageReader.getSurface();
            }
            if (surface != null) {
                this.f312810r.mo148277m(surface, Integer.valueOf(this.f312814v.f324711u.f324764b.f320920a), Integer.valueOf(this.f312814v.f324711u.f324764b.f320921b));
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect;
        super.onSizeChanged(i, i2, i3, i4);
        View findViewById = findViewById(C0966R.C0970id.e6e);
        View findViewById2 = findViewById(C0966R.C0970id.iid);
        View findViewById3 = findViewById(C0966R.C0970id.e6d);
        View findViewById4 = findViewById(C0966R.C0970id.apr);
        View findViewById5 = findViewById(C0966R.C0970id.ii6);
        int c = C75044y4.m89991c(getContext());
        if (getContext() instanceof Activity) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            rect = C85875k4.m106194m((Activity) context);
        } else {
            rect = new Rect();
        }
        Rect rect2 = rect;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i5 = i2;
        findViewById4.getViewTreeObserver().addOnGlobalLayoutListener(new C13100b(findViewById4, i5, this, c, (RelativeLayout.LayoutParams) layoutParams, (RelativeLayout.LayoutParams) layoutParams3, (RelativeLayout.LayoutParams) layoutParams2, findViewById3, rect2, findViewById2, findViewById, findViewById5));
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        Log.m105924i("MicroMsg.FinderRecordTemplatePluginLayout", "status : " + bVar + "  param: " + bundle);
        BaseScopePluginLayout.m119451m(this, C53872d1.f151119c, (C53934p0) null, new C105294e(bVar, this, bundle, (C15601d<? super C105294e>) null), 2, (Object) null);
    }

    /* renamed from: r */
    public final boolean mo149736r() {
        C108400c cVar = this.f312810r;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type android.view.View");
        if (((View) cVar).getVisibility() == 0) {
            if (!(this.f312814v.f324698e.getVisibility() == 0)) {
                return true;
            }
        }
        return false;
    }

    public void release() {
        C14267a aVar = C14267a.f39802a;
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + 0 + ", field: " + C60781a.f173119b);
        C60781a.f173119b = 0;
        C14267a.f39804c = null;
        super.release();
        getLifecycleRegistry().mo145135c(C39623j.C39625b.ON_DESTROY);
    }

    public void reset() {
        super.reset();
        this.f312809q.reset();
    }

    /* renamed from: t */
    public final void mo149737t(ArrayList<String> arrayList, C64237ap1 ap12) {
        ArrayList<String> arrayList2 = arrayList;
        C98324b bVar = r2;
        C98324b bVar2 = new C98324b((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
        String str = arrayList2.get(0);
        C87412m.m108593f(str, "pathArray[0]");
        C98324b bVar3 = bVar;
        bVar3.f288180a = str;
        bVar3.f288191l = arrayList2;
        bVar3.f288182c = true;
        if (ap12 != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("KEY_POST_VIDEO_TEMPLATE", ap12.toByteArray());
            bVar3.f288193n = bundle;
        }
        RecordConfigProvider recordConfigProvider = this.f312817y;
        Bundle bundle2 = recordConfigProvider != null ? recordConfigProvider.f272912M : null;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
        for (String c : arrayList) {
            arrayList3.add(GalleryItem$MediaItem.m65488c(2, 0, c, "", ""));
        }
        Object[] array = arrayList3.toArray(new GalleryItem$MediaItem[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        bundle2.putParcelableArrayList("media_list", (ArrayList) C110823p.m151003c0(array));
        RecordConfigProvider recordConfigProvider2 = this.f312817y;
        if (recordConfigProvider2 != null) {
            recordConfigProvider2.f272912M = bundle2;
        }
        C102440a aVar = this.f312816x;
        if (aVar != null) {
            aVar.mo142012b(4, bVar3);
        }
    }

    /* renamed from: w */
    public final Object mo149738w(boolean z, Surface surface, C15601d<? super C13598b0> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C105295f(z, surface, this, (C15601d<? super C105295f>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }
}
