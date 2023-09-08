package kr1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fh2.C107541d;
import fh2.C107543l;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j03.C60700d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh2.C108745d;
import lh2.C109344g0;
import ph2.C110218c;
import qh2.C101198e;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49044cs2;

/* renamed from: kr1.a */
public final class C109034a implements C109344g0 {

    /* renamed from: d */
    public final ViewGroup f326541d;

    /* renamed from: e */
    public final C101198e f326542e;

    /* renamed from: f */
    public C110218c f326543f;

    /* renamed from: g */
    public EditorAudioView f326544g;

    /* renamed from: h */
    public List<AudioCacheInfo> f326545h = C64186f0.f181907d;

    /* renamed from: i */
    public final C107541d f326546i = new C107541d();

    /* renamed from: j */
    public boolean f326547j;

    /* renamed from: n */
    public AudioCacheInfo f326548n;

    /* renamed from: o */
    public boolean f326549o;

    /* renamed from: p */
    public boolean f326550p = true;

    /* renamed from: q */
    public long f326551q = 500;

    /* renamed from: r */
    public List<C109035a> f326552r = new ArrayList();

    /* renamed from: s */
    public final Runnable f326553s = new C109038d(this);

    /* renamed from: kr1.a$a */
    public interface C109035a {
        /* renamed from: a */
        void mo160160a();

        /* renamed from: b */
        void mo160161b();
    }

    /* renamed from: kr1.a$b */
    public static final class C109036b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109034a f326554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109036b(C109034a aVar) {
            super(1);
            this.f326554d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f326554d.f326542e, C101198e.C101199b.EDIT_ADD_MUSIC, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f326554d.f326542e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
                C101198e.C62622a.m73576a(this.f326554d.f326542e, C101198e.C101199b.EDIT_ADD_MUSIC_DONE, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kr1.a$c */
    public static final class C109037c implements EditorAudioView.C106012i {

        /* renamed from: a */
        public final /* synthetic */ C109034a f326555a;

        public C109037c(C109034a aVar) {
            this.f326555a = aVar;
        }

        /* renamed from: a */
        public void mo151422a() {
            C101198e.C62622a.m73576a(this.f326555a.f326542e, C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_CANCEL, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: b */
        public void mo151423b(AudioCacheInfo audioCacheInfo) {
            C87412m.m108594g(audioCacheInfo, "info");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", audioCacheInfo);
            this.f326555a.f326542e.mo14585p(C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_FINISH, bundle);
        }

        /* renamed from: c */
        public void mo151424c(AudioCacheInfo audioCacheInfo) {
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_SELECT_MUSIC;
            if (C87412m.m108589b(this.f326555a.f326548n, audioCacheInfo)) {
                C109034a aVar = this.f326555a;
                if (aVar.f326548n != null) {
                    aVar.mo160158c();
                }
            } else if (audioCacheInfo == null) {
                C109034a aVar2 = this.f326555a;
                aVar2.f326548n = audioCacheInfo;
                C110218c cVar = aVar2.f326543f;
                if (cVar != null) {
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
                C101198e.C62622a.m73576a(this.f326555a.f326542e, bVar, (Bundle) null, 2, (Object) null);
                Bundle bundle = new Bundle();
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
                this.f326555a.f326542e.mo14585p(C101198e.C101199b.EDIT_SELECT_LYRICS, bundle);
                this.f326555a.f326542e.mo14585p(C101198e.C101199b.RECORD_UN_CLICK_MUSIC, (Bundle) null);
            } else if (audioCacheInfo.f163820o == 2) {
                this.f326555a.mo160157b();
                C101198e.C62622a.m73576a(this.f326555a.f326542e, C101198e.C101199b.EDIT_ADD_MUSIC_ENTER_SELECT_ENTRANCE, (Bundle) null, 2, (Object) null);
            } else {
                C109034a aVar3 = this.f326555a;
                aVar3.f326548n = audioCacheInfo;
                C101198e.C62622a.m73576a(aVar3.f326542e, bVar, (Bundle) null, 2, (Object) null);
                C109034a aVar4 = this.f326555a;
                if (aVar4.f326550p) {
                    aVar4.f326550p = false;
                    EditorAudioView editorAudioView = aVar4.f326544g;
                    if (editorAudioView != null) {
                        editorAudioView.postDelayed(aVar4.f326553s, aVar4.f326551q);
                    }
                } else if (aVar4.f326549o) {
                    C110218c cVar2 = aVar4.f326543f;
                    if (cVar2 != null) {
                        cVar2.mo161624b(aVar4.f326548n);
                    }
                } else {
                    C110218c cVar3 = aVar4.f326543f;
                    if (cVar3 != null) {
                        cVar3.mo161625c(aVar4.f326548n);
                    }
                }
                C108745d dVar3 = C108745d.f325633i;
                if (dVar3 != null) {
                    dVar3.mo159767c(audioCacheInfo.f163813e, audioCacheInfo.f163821p);
                }
            }
        }

        /* renamed from: d */
        public void mo151425d(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z);
            this.f326555a.f326542e.mo14585p(C101198e.C101199b.EDIT_SET_ORIGIN_MUTE, bundle);
        }

        /* renamed from: e */
        public void mo151426e() {
            this.f326555a.mo160157b();
        }

        /* renamed from: f */
        public void mo151427f(boolean z, List<? extends C49044cs2> list) {
            C87412m.m108594g(list, "lyricsInfos");
        }
    }

    /* renamed from: kr1.a$d */
    public static final class C109038d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109034a f326556d;

        public C109038d(C109034a aVar) {
            this.f326556d = aVar;
        }

        public final void run() {
            C109034a aVar = this.f326556d;
            if (aVar.f326549o) {
                C110218c cVar = aVar.f326543f;
                if (cVar != null) {
                    cVar.mo161624b(aVar.f326548n);
                    return;
                }
                return;
            }
            C110218c cVar2 = aVar.f326543f;
            if (cVar2 != null) {
                cVar2.mo161625c(aVar.f326548n);
            }
        }
    }

    public C109034a(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f326541d = viewGroup;
        this.f326542e = eVar;
    }

    /* renamed from: a */
    public final void mo160156a() {
        if (this.f326544g == null) {
            Context context = this.f326541d.getContext();
            C87412m.m108593f(context, "parent.context");
            EditorAudioView editorAudioView = new EditorAudioView(context, (AttributeSet) null);
            this.f326544g = editorAudioView;
            editorAudioView.setVisibility(8);
            this.f326541d.addView(this.f326544g);
            Context context2 = this.f326541d.getContext();
            C87412m.m108593f(context2, "parent.context");
            this.f326543f = new C110218c(context2);
            EditorAudioView editorAudioView2 = this.f326544g;
            if (editorAudioView2 != null) {
                editorAudioView2.setBackground(C0966R.C0969drawable.azc);
            }
            EditorAudioView editorAudioView3 = this.f326544g;
            if (editorAudioView3 != null) {
                editorAudioView3.setOnVisibleChangeCallback(new C109036b(this));
            }
            EditorAudioView editorAudioView4 = this.f326544g;
            if (editorAudioView4 != null) {
                editorAudioView4.mo151394l(C30517h0.m39112a());
            }
            EditorAudioView editorAudioView5 = this.f326544g;
            if (editorAudioView5 != null) {
                EditorAudioView.m142568q(editorAudioView5, Integer.valueOf(C0966R.C0969drawable.f4531f7), (Integer) null, (String) null, Integer.valueOf(C0966R.C0969drawable.b9l), (Integer) null, Integer.valueOf(C0966R.raw.popvideo_post_selected_origin), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, true, 8144, (Object) null);
            }
            EditorAudioView editorAudioView6 = this.f326544g;
            if (editorAudioView6 != null) {
                editorAudioView6.setCallback(new C109037c(this));
            }
            EditorAudioView editorAudioView7 = this.f326544g;
            if (editorAudioView7 != null) {
                editorAudioView7.setLocalAudioList(this.f326545h);
            }
            EditorAudioView editorAudioView8 = this.f326544g;
            if (editorAudioView8 != null) {
                EditorAudioView.m142569v(editorAudioView8, "", new ArrayList(), -1, -1, false, this.f326546i, this.f326547j, 16, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo160157b() {
        C110218c cVar = this.f326543f;
        if (cVar != null) {
            cVar.mo161623a();
        }
        for (C109035a b : this.f326552r) {
            b.mo160161b();
        }
    }

    /* renamed from: c */
    public final void mo160158c() {
        C110218c cVar = this.f326543f;
        if (cVar != null) {
            Log.m105924i(cVar.f329717a, "resume music");
            C60700d dVar = cVar.f329718b;
            if (dVar != null) {
                dVar.mo85619m();
            }
        }
        Iterator it = ((ArrayList) this.f326552r).iterator();
        while (it.hasNext()) {
            ((C109035a) it.next()).mo160160a();
        }
    }

    /* renamed from: d */
    public final void mo160159d(RecordConfigProvider recordConfigProvider, boolean z, boolean z2) {
        Class cls = C32735h.class;
        Integer valueOf = recordConfigProvider != null ? Integer.valueOf(recordConfigProvider.f272905F) : null;
        boolean z3 = false;
        if (valueOf != null && valueOf.intValue() == 2) {
            C107541d dVar = this.f326546i;
            C107543l lVar = C107543l.SNSComm;
            dVar.getClass();
            dVar.f321753f = lVar;
            C107541d dVar2 = this.f326546i;
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_video_editor_lyrics_enable, 0) == 1) {
                z3 = true;
            }
            dVar2.f321749b = z3;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            C107541d dVar3 = this.f326546i;
            C107543l lVar2 = C107543l.Chatting;
            dVar3.getClass();
            dVar3.f321753f = lVar2;
        } else if (valueOf != null && valueOf.intValue() == 3) {
            C107541d dVar4 = this.f326546i;
            C107543l lVar3 = C107543l.StoryComm;
            dVar4.getClass();
            dVar4.f321753f = lVar3;
            C107541d dVar5 = this.f326546i;
            dVar5.f321749b = true;
            dVar5.f321752e = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_story_visitor_enable, false);
        } else if (valueOf != null && valueOf.intValue() == 5) {
            C107541d dVar6 = this.f326546i;
            C107543l lVar4 = C107543l.WXGGame;
            dVar6.getClass();
            dVar6.f321753f = lVar4;
        } else if (valueOf != null && valueOf.intValue() == 11) {
            C107541d dVar7 = this.f326546i;
            C107543l lVar5 = C107543l.Finder;
            dVar7.getClass();
            dVar7.f321753f = lVar5;
            this.f326546i.f321749b = false;
        }
        this.f326546i.f321751d = z;
        this.f326547j = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo78564e() {
        /*
            r4 = this;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r0 = r4.f326544g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            boolean r3 = r0.mo151395m()
            if (r3 == 0) goto L_0x0011
            r0.mo151390h()
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != r2) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kr1.C109034a.mo78564e():boolean");
    }

    public String name() {
        return C109034a.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
        mo160157b();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        if (this.f326549o && this.f326548n != null) {
            mo160158c();
        }
    }

    public void release() {
        this.f326548n = null;
        C110218c cVar = this.f326543f;
        if (cVar != null) {
            cVar.mo161626d();
        }
        EditorAudioView editorAudioView = this.f326544g;
        if (editorAudioView != null) {
            editorAudioView.mo151393k();
        }
    }

    public void reset() {
        C110218c cVar;
        if (this.f326548n != null && (cVar = this.f326543f) != null) {
            cVar.mo161627e(0);
        }
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
