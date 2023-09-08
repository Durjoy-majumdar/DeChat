package j23;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TestKvReportStruct;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.model.audio.LyricsInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fh2.C107541d;
import fh2.C107543l;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60700d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh2.C108745d;
import k20.C60958c;
import k20.C9556a;
import l23.C109202j;
import lh2.C109344g0;
import lh2.C99417a;
import ph2.C110218c;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C49044cs2;
import th2.C110992d;

/* renamed from: j23.a */
public final class C108531a extends C99417a implements View.OnClickListener, C109202j.C109205d, C109202j.C109204c, C109202j.C99301e {

    /* renamed from: f */
    public ViewGroup f324874f;

    /* renamed from: g */
    public final ImageView f324875g;

    /* renamed from: h */
    public final ImageView f324876h;

    /* renamed from: i */
    public final View f324877i;

    /* renamed from: j */
    public final EditorAudioView f324878j;

    /* renamed from: n */
    public final C110218c f324879n;

    /* renamed from: o */
    public final View f324880o;

    /* renamed from: p */
    public AudioCacheInfo f324881p;

    /* renamed from: q */
    public C107541d f324882q;

    /* renamed from: r */
    public boolean f324883r;

    /* renamed from: s */
    public boolean f324884s;

    /* renamed from: t */
    public boolean f324885t;

    /* renamed from: u */
    public long f324886u;

    /* renamed from: v */
    public List<C108535d> f324887v;

    /* renamed from: w */
    public boolean f324888w;

    /* renamed from: j23.a$a */
    public static final class C108532a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f324889d;

        /* renamed from: e */
        public final /* synthetic */ C108531a f324890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108532a(C101198e eVar, C108531a aVar) {
            super(1);
            this.f324889d = eVar;
            this.f324890e = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f324889d, C101198e.C101199b.EDIT_ADD_MUSIC, (Bundle) null, 2, (Object) null);
                this.f324890e.f324886u = -1;
            } else {
                C101198e.C62622a.m73576a(this.f324889d, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
                C101198e eVar = this.f324889d;
                C101198e.C101199b bVar = C101198e.C101199b.EDIT_ADD_MUSIC_DONE;
                Bundle bundle = new Bundle();
                bundle.putLong("PARAM_1_LONG", this.f324890e.f324886u);
                C13598b0 b0Var = C13598b0.f38549a;
                eVar.mo14585p(bVar, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j23.a$b */
    public static final class C108533b implements EditorAudioView.C106012i {

        /* renamed from: a */
        public final /* synthetic */ C101198e f324891a;

        /* renamed from: b */
        public final /* synthetic */ C108531a f324892b;

        public C108533b(C101198e eVar, C108531a aVar) {
            this.f324891a = eVar;
            this.f324892b = aVar;
        }

        /* renamed from: a */
        public void mo151422a() {
            C101198e.C62622a.m73576a(this.f324891a, C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_CANCEL, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: b */
        public void mo151423b(AudioCacheInfo audioCacheInfo) {
            C87412m.m108594g(audioCacheInfo, "info");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", audioCacheInfo);
            this.f324891a.mo14585p(C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_FINISH, bundle);
        }

        /* renamed from: c */
        public void mo151424c(AudioCacheInfo audioCacheInfo) {
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_SELECT_MUSIC;
            Log.m105924i("MicroMsg.EditAddMusicPlugin", "onAudioSelected:" + audioCacheInfo);
            if (C87412m.m108589b(this.f324892b.f324881p, audioCacheInfo)) {
                C108531a aVar = this.f324892b;
                if (aVar.f324881p != null) {
                    aVar.mo159385E();
                    return;
                }
                return;
            }
            int i = 0;
            if (audioCacheInfo == null) {
                C108531a aVar2 = this.f324892b;
                aVar2.f324886u = 0;
                aVar2.f324881p = audioCacheInfo;
                aVar2.f324876h.setVisibility(8);
                aVar2.f324881p = null;
                aVar2.mo159382B();
                C101198e.C62622a.m73576a(this.f324891a, bVar, (Bundle) null, 2, (Object) null);
                Bundle bundle = new Bundle();
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
                this.f324891a.mo14585p(C101198e.C101199b.EDIT_SELECT_LYRICS, bundle);
                this.f324891a.mo14585p(C101198e.C101199b.RECORD_UN_CLICK_MUSIC, (Bundle) null);
            } else if (audioCacheInfo.f163820o == 2) {
                C101198e.C62622a.m73576a(this.f324891a, C101198e.C101199b.EDIT_ADD_MUSIC_ENTER_SELECT_ENTRANCE, (Bundle) null, 2, (Object) null);
            } else {
                Log.m105924i("MicroMsg.EditAddMusicPlugin", "play music:" + audioCacheInfo.f163814f + " cached:" + audioCacheInfo.f163818j + " cachePath:" + audioCacheInfo.f163817i + "  cacheFile:" + C86013q1.m106450k(audioCacheInfo.f163817i));
                if ((!audioCacheInfo.f163818j || !TextUtils.isEmpty(audioCacheInfo.f163817i)) && (audioCacheInfo.f163818j || !TextUtils.isEmpty(audioCacheInfo.f163814f))) {
                    this.f324892b.f324876h.setVisibility(0);
                    this.f324892b.f324881p = audioCacheInfo;
                    C101198e.C62622a.m73576a(this.f324891a, bVar, (Bundle) null, 2, (Object) null);
                    this.f324892b.f324879n.mo161624b(audioCacheInfo);
                    C108531a aVar3 = this.f324892b;
                    aVar3.f324886u = (long) audioCacheInfo.f163822q;
                    Iterator it = ((ArrayList) aVar3.f324887v).iterator();
                    while (it.hasNext()) {
                        ((C108535d) it.next()).mo159394a();
                    }
                    C110992d dVar = C110992d.f332425a;
                    dVar.mo162677k("KEY_MUSIC_ID_INT", Integer.valueOf(audioCacheInfo.f163813e));
                    dVar.mo162677k("KEY_MUSIC_INDEX_INT", Integer.valueOf(audioCacheInfo.f163821p == 4 ? 0 : audioCacheInfo.f163828w + 1));
                    dVar.mo162677k("KEY_MUSIC_REQ_ID_INT", Long.valueOf(audioCacheInfo.f163829x));
                    if (audioCacheInfo.f163821p == 4) {
                        i = 1;
                    }
                    dVar.mo162677k("KEY_SEARCH_MUSIC_INT", Integer.valueOf(i));
                    C108745d dVar2 = C108745d.f325633i;
                    if (dVar2 != null) {
                        dVar2.mo159767c(audioCacheInfo.f163813e, audioCacheInfo.f163821p);
                        return;
                    }
                    return;
                }
                TestKvReportStruct testKvReportStruct = new TestKvReportStruct();
                testKvReportStruct.f266360g = 2020;
                testKvReportStruct.f266359f = testKvReportStruct.mo86045b("MsgExt", "null music url", true);
                testKvReportStruct.mo86054n();
            }
        }

        /* renamed from: d */
        public void mo151425d(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z);
            this.f324891a.mo14585p(C101198e.C101199b.EDIT_SET_ORIGIN_MUTE, bundle);
        }

        /* renamed from: e */
        public void mo151426e() {
            this.f324892b.mo159382B();
        }

        /* renamed from: f */
        public void mo151427f(boolean z, List<? extends C49044cs2> list) {
            C87412m.m108594g(list, "lyricsInfos");
            Bundle bundle = new Bundle();
            if (!list.isEmpty()) {
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z);
                bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new LyricsInfo(list));
            } else {
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
            }
            this.f324891a.mo14585p(C101198e.C101199b.EDIT_SELECT_LYRICS, bundle);
        }
    }

    /* renamed from: j23.a$c */
    public static final class C108534c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108531a f324893d;

        public C108534c(C108531a aVar) {
            this.f324893d = aVar;
        }

        public final void run() {
            View view = this.f324893d.f324880o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: j23.a$d */
    public interface C108535d {
        /* renamed from: a */
        void mo159394a();

        /* renamed from: b */
        void mo159395b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C108531a(android.view.ViewGroup r18, qh2.C101198e r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "parent"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r2, r3)
            r0.f324874f = r1
            r4 = 2131301291(0x7f0913ab, float:1.8220636E38)
            android.view.View r1 = r1.findViewById(r4)
            java.lang.String r4 = "parent.findViewById(R.id.editor_add_audio)"
            gy3.C87412m.m108593f(r1, r4)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f324875g = r1
            android.view.ViewGroup r4 = r0.f324874f
            r5 = 2131301292(0x7f0913ac, float:1.8220638E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "parent.findViewById(R.id.editor_add_audio_check)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0.f324876h = r4
            android.view.ViewGroup r5 = r0.f324874f
            r6 = 2131301293(0x7f0913ad, float:1.822064E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "parent.findViewById(R.id.editor_add_audio_group)"
            gy3.C87412m.m108593f(r5, r6)
            r0.f324877i = r5
            android.view.ViewGroup r6 = r0.f324874f
            r7 = 2131301310(0x7f0913be, float:1.8220674E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "parent.findViewById(R.id.editor_audio_panel)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r6 = (com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView) r6
            r0.f324878j = r6
            ph2.c r7 = new ph2.c
            android.view.ViewGroup r8 = r0.f324874f
            android.content.Context r8 = r8.getContext()
            java.lang.String r9 = "parent.context"
            gy3.C87412m.m108593f(r8, r9)
            r7.<init>(r8)
            r0.f324879n = r7
            android.view.ViewGroup r7 = r0.f324874f
            r8 = 2131315236(0x7f094a24, float:1.824892E38)
            android.view.View r15 = r7.findViewById(r8)
            java.lang.String r7 = "parent.findViewById(R.id…editor_add_music_tooltip)"
            gy3.C87412m.m108593f(r15, r7)
            r0.f324880o = r15
            fh2.d r7 = new fh2.d
            r7.<init>()
            r0.f324882q = r7
            r7 = 1
            r0.f324883r = r7
            r0.f324885t = r7
            r8 = -1
            r0.f324886u = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.f324887v = r8
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_show_mediacomponent_audio
            boolean r7 = r8.mo58784wf(r9, r7)
            r0.f324883r = r7
            r7 = 2131231155(0x7f0801b3, float:1.8078383E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = -1
            r0.mo159383C(r7, r3, r3, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "forceEnable "
            r3.append(r7)
            boolean r7 = r0.f324883r
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "MicroMsg.EditAddMusicPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            android.view.ViewGroup r3 = r0.f324874f
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r7 = 2131756833(0x7f100721, float:1.9144585E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)
            r4.setImageDrawable(r3)
            android.view.ViewGroup r3 = r0.f324874f
            android.content.Context r3 = r3.getContext()
            r4 = 2131756160(0x7f100480, float:1.914322E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r8)
            r1.setImageDrawable(r3)
            r1.setOnClickListener(r0)
            boolean r1 = r0.f324883r
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L_0x0105
            j23.a$a r1 = new j23.a$a
            r1.<init>(r2, r0)
            r6.setOnVisibleChangeCallback(r1)
            j23.a$b r1 = new j23.a$b
            r1.<init>(r2, r0)
            r6.setCallback(r1)
            goto L_0x0143
        L_0x0105:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r2)
            java.lang.Object[] r8 = r1.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r10 = "<init>"
            java.lang.String r11 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r9 = "<init>"
            java.lang.String r10 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0143:
            boolean r1 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39112a()
            r6.mo151394l(r1)
            boolean r1 = r6.getShouldShowSelectFinderVideoRedDot()
            if (r1 == 0) goto L_0x019c
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r2)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r12 = "<init>"
            java.lang.String r13 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r2 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r15
            r5 = r15
            r15 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r11 = "<init>"
            java.lang.String r12 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r9 = r5
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            j23.a$c r1 = new j23.a$c
            r1.<init>(r0)
            r2 = 5000(0x1388, double:2.4703E-320)
            r5.postDelayed(r1, r2)
            goto L_0x01db
        L_0x019c:
            r5 = r15
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r2)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r12 = "<init>"
            java.lang.String r13 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin"
            java.lang.String r11 = "<init>"
            java.lang.String r12 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.C108531a.<init>(android.view.ViewGroup, qh2.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m147079H(j23.C108531a r22, h90.C98324b r23, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r24, boolean r25, boolean r26, boolean r27, int r28, java.lang.Object r29) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            r4 = r28 & 4
            r5 = 1
            if (r4 == 0) goto L_0x000f
            r4 = 1
            goto L_0x0011
        L_0x000f:
            r4 = r25
        L_0x0011:
            r6 = r28 & 8
            if (r6 == 0) goto L_0x0017
            r6 = 1
            goto L_0x0019
        L_0x0017:
            r6 = r26
        L_0x0019:
            r7 = r28 & 16
            r8 = 0
            if (r7 == 0) goto L_0x0020
            r7 = 0
            goto L_0x0022
        L_0x0020:
            r7 = r27
        L_0x0022:
            r22.getClass()
            java.lang.String r9 = "info"
            gy3.C87412m.m108594g(r1, r9)
            jh2.d r9 = new jh2.d
            r9.<init>()
            jh2.C108745d.f325633i = r9
            fh2.d r9 = new fh2.d
            r9.<init>()
            r0.f324882q = r9
            java.util.ArrayList<java.lang.String> r9 = r1.f288190k
            if (r9 == 0) goto L_0x0045
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r9 = 0
            goto L_0x0046
        L_0x0045:
            r9 = 1
        L_0x0046:
            if (r9 != 0) goto L_0x004c
            if (r4 == 0) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "editorConfig : "
            r9.append(r10)
            fh2.d r10 = r0.f324882q
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.EditAddMusicPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            int r9 = r1.f288184e
            long r9 = (long) r9
            if (r2 == 0) goto L_0x0071
            int r11 = r2.f272905F
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            r12 = 2
            if (r11 != 0) goto L_0x0076
            goto L_0x009a
        L_0x0076:
            int r13 = r11.intValue()
            if (r13 != r12) goto L_0x009a
            fh2.d r2 = r0.f324882q
            fh2.l r6 = fh2.C107543l.SNSComm
            r2.getClass()
            r2.f321753f = r6
            fh2.d r2 = r0.f324882q
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_video_editor_lyrics_enable
            int r3 = r3.mo58779Qe(r6, r8)
            if (r3 != r5) goto L_0x0096
            r8 = 1
        L_0x0096:
            r2.f321749b = r8
            goto L_0x015e
        L_0x009a:
            if (r11 != 0) goto L_0x009d
            goto L_0x00ae
        L_0x009d:
            int r12 = r11.intValue()
            if (r12 != r5) goto L_0x00ae
            fh2.d r2 = r0.f324882q
            fh2.l r3 = fh2.C107543l.Chatting
            r2.getClass()
            r2.f321753f = r3
            goto L_0x015e
        L_0x00ae:
            r12 = 3
            if (r11 != 0) goto L_0x00b2
            goto L_0x00d7
        L_0x00b2:
            int r13 = r11.intValue()
            if (r13 != r12) goto L_0x00d7
            fh2.d r2 = r0.f324882q
            fh2.l r6 = fh2.C107543l.StoryComm
            r2.getClass()
            r2.f321753f = r6
            fh2.d r2 = r0.f324882q
            r2.f321749b = r5
            r2.f321748a = r4
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_story_visitor_enable
            boolean r3 = r3.mo58784wf(r6, r8)
            r2.f321752e = r3
            goto L_0x015e
        L_0x00d7:
            r12 = 5
            if (r11 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            int r13 = r11.intValue()
            if (r13 != r12) goto L_0x00ec
            fh2.d r2 = r0.f324882q
            fh2.l r3 = fh2.C107543l.WXGGame
            r2.getClass()
            r2.f321753f = r3
            goto L_0x015e
        L_0x00ec:
            r12 = 11
            if (r11 != 0) goto L_0x00f2
            goto L_0x015e
        L_0x00f2:
            int r11 = r11.intValue()
            if (r11 != r12) goto L_0x015e
            fh2.d r11 = r0.f324882q
            fh2.l r12 = fh2.C107543l.Finder
            r11.getClass()
            r11.f321753f = r12
            fh2.d r11 = r0.f324882q
            if (r7 != 0) goto L_0x011a
            di3.d r12 = di3.C86312j.m106911c(r3)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_edit_enable_music_lyrics
            int r12 = r12.mo58779Qe(r13, r5)
            if (r12 != r5) goto L_0x0115
            r12 = 1
            goto L_0x0116
        L_0x0115:
            r12 = 0
        L_0x0116:
            if (r12 == 0) goto L_0x011a
            r12 = 1
            goto L_0x011b
        L_0x011a:
            r12 = 0
        L_0x011b:
            r11.f321749b = r12
            fh2.d r11 = r0.f324882q
            if (r6 != 0) goto L_0x0132
            android.os.Bundle r6 = r1.f288193n
            if (r6 == 0) goto L_0x012c
            java.lang.String r12 = "SELECT_MUTE_ORIGIN_KEY"
            boolean r6 = r6.getBoolean(r12, r8)
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 == 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r6 = 0
            goto L_0x0133
        L_0x0132:
            r6 = 1
        L_0x0133:
            r11.f321750c = r6
            fh2.d r6 = r0.f324882q
            if (r7 == 0) goto L_0x0153
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_finder_edit_image_auto_add_music
            int r3 = r3.mo58779Qe(r7, r5)
            if (r3 != r5) goto L_0x014f
            boolean r3 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r3 == 0) goto L_0x014f
            r3 = 1
            goto L_0x0150
        L_0x014f:
            r3 = 0
        L_0x0150:
            if (r3 == 0) goto L_0x0153
            r8 = 1
        L_0x0153:
            r6.f321748a = r8
            int r3 = r1.f288184e
            int r2 = r2.f272935w
            if (r3 <= r2) goto L_0x015e
            long r2 = (long) r2
            r15 = r2
            goto L_0x015f
        L_0x015e:
            r15 = r9
        L_0x015f:
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r2 = r0.f324878j
            r2.setPlayMusicWhenSearchFinish(r5)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r10 = r0.f324878j
            java.lang.String r11 = r1.f288180a
            java.util.ArrayList<java.lang.String> r12 = r1.f288190k
            int r1 = r1.f288183d
            long r13 = (long) r1
            fh2.d r0 = r0.f324882q
            r19 = 0
            r20 = 64
            r21 = 0
            r17 = r4
            r18 = r0
            com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView.m142569v(r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.C108531a.m147079H(j23.a, h90.b, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    /* renamed from: A */
    public final void mo159381A() {
        this.f324878j.mo151412x(false);
    }

    /* renamed from: B */
    public final void mo159382B() {
        Log.m105924i("MicroMsg.EditAddMusicPlugin", "pauseMusic");
        this.f324879n.mo161623a();
        for (C108535d b : this.f324887v) {
            b.mo159395b();
        }
    }

    /* renamed from: C */
    public final void mo159383C(Integer num, Integer num2, String str, int i) {
        int i2 = i;
        EditorAudioView.m142568q(this.f324878j, num, num2, str, Integer.valueOf(C0966R.C0969drawable.b9l), (Integer) null, Integer.valueOf(C0966R.raw.popvideo_post_selected_origin), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, true, 8144, (Object) null);
        if (i2 != -1) {
            this.f324876h.setImageDrawable(this.f324874f.getContext().getResources().getDrawable(i2));
        }
    }

    /* renamed from: D */
    public final void mo159384D() {
        this.f324879n.mo161627e(0);
        for (C108535d a : this.f324887v) {
            a.mo159394a();
        }
    }

    /* renamed from: E */
    public final void mo159385E() {
        Log.m105924i("MicroMsg.EditAddMusicPlugin", "resumeMusic");
        if (this.f324881p != null) {
            C110218c cVar = this.f324879n;
            Log.m105924i(cVar.f329717a, "resume music");
            C60700d dVar = cVar.f329718b;
            if (dVar != null) {
                dVar.mo85619m();
            }
            Iterator it = ((ArrayList) this.f324887v).iterator();
            while (it.hasNext()) {
                ((C108535d) it.next()).mo159394a();
            }
        }
    }

    /* renamed from: F */
    public final void mo159386F(long j) {
        this.f324879n.mo161627e(j);
        for (C108535d a : this.f324887v) {
            a.mo159394a();
        }
    }

    /* renamed from: G */
    public final void mo159387G(List<AudioCacheInfo> list) {
        C87412m.m108594g(list, "audioList");
        this.f324878j.setLocalAudioList(list);
    }

    /* renamed from: c */
    public void mo138712c(long j) {
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public boolean mo78564e() {
        boolean z;
        EditorAudioView editorAudioView = this.f324878j;
        if (editorAudioView.mo151395m()) {
            editorAudioView.mo151390h();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        this.f324878j.mo151398p();
        C108745d dVar = C108745d.f325633i;
        if (dVar != null) {
            dVar.mo159765a();
        }
        return false;
    }

    /* renamed from: k */
    public void mo138704k(long j, Object obj) {
        mo159386F(j);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f324885t) {
            this.f324888w = this.f324880o.getVisibility() == 0;
            View view2 = this.f324880o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f324878j.setShow(true);
            C110992d dVar = C110992d.f332425a;
            C110992d.m151314c(dVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, (Object) null);
            dVar.mo162669b(6);
            dVar.mo162670d(5);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
        onPause();
    }

    public void onFinish() {
    }

    public void onPause() {
        Log.m105924i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        mo159382B();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        if (!this.f324884s && this.f324878j.getWithMusic()) {
            mo159385E();
        }
    }

    public void pause() {
    }

    public void release() {
        reset();
        this.f324881p = null;
        this.f324879n.mo161626d();
        this.f324878j.mo151393k();
    }

    public void reset() {
        this.f324876h.setVisibility(8);
        this.f324881p = null;
        C110218c cVar = this.f324879n;
        Log.m105924i(cVar.f329717a, "reset music");
        C60700d dVar = cVar.f329718b;
        if (dVar != null) {
            dVar.stop();
        }
        C60700d dVar2 = cVar.f329718b;
        if (dVar2 != null) {
            dVar2.recycle();
        }
        cVar.f329718b = null;
    }

    public void resume() {
    }

    /* renamed from: s */
    public void mo159389s(C96552p0 p0Var, long j, boolean z) {
    }

    public void setVisibility(int i) {
        if (this.f324883r) {
            View view = this.f324877i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: x */
    public final void mo159390x() {
        C107541d dVar = this.f324882q;
        if (dVar.f321753f == C107543l.StoryComm && dVar.f321752e) {
            this.f324878j.setShow(true);
        }
    }

    /* renamed from: y */
    public final AudioCacheInfo mo159391y() {
        return this.f324881p;
    }

    /* renamed from: z */
    public final boolean mo159392z() {
        return this.f324878j.getMuteOrigin();
    }
}
