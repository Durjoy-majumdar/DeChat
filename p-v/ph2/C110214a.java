package ph2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.model.audio.LyricsInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import fh2.C107541d;
import fh2.C107543l;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j03.C60700d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jh2.C108745d;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C49044cs2;
import th2.C110992d;

/* renamed from: ph2.a */
public final class C110214a implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f329704d;

    /* renamed from: e */
    public C101198e f329705e;

    /* renamed from: f */
    public final ImageView f329706f;

    /* renamed from: g */
    public final View f329707g;

    /* renamed from: h */
    public final EditorAudioView f329708h;

    /* renamed from: i */
    public final C110218c f329709i;

    /* renamed from: j */
    public AudioCacheInfo f329710j;

    /* renamed from: n */
    public C107541d f329711n;

    /* renamed from: o */
    public boolean f329712o;

    /* renamed from: ph2.a$a */
    public static final class C110215a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110214a f329713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110215a(C110214a aVar) {
            super(1);
            this.f329713d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f329713d.f329705e, C101198e.C101199b.EDIT_ADD_MUSIC, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f329713d.f329705e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ph2.a$b */
    public static final class C110216b implements EditorAudioView.C106012i {

        /* renamed from: a */
        public final /* synthetic */ C110214a f329714a;

        public C110216b(C110214a aVar) {
            this.f329714a = aVar;
        }

        /* renamed from: a */
        public void mo151422a() {
            C101198e.C62622a.m73576a(this.f329714a.f329705e, C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_CANCEL, (Bundle) null, 2, (Object) null);
        }

        /* renamed from: b */
        public void mo151423b(AudioCacheInfo audioCacheInfo) {
            C87412m.m108594g(audioCacheInfo, "info");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EDIT_VLOG_SEARCH_MUSIC_FINISH_PARCELABLE", audioCacheInfo);
            this.f329714a.f329705e.mo14585p(C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_FINISH, bundle);
        }

        /* renamed from: c */
        public void mo151424c(AudioCacheInfo audioCacheInfo) {
            int i = 0;
            if (audioCacheInfo == null) {
                C110214a aVar = this.f329714a;
                aVar.f329706f.setVisibility(8);
                aVar.f329710j = null;
                aVar.f329709i.mo161623a();
                View view = aVar.f329707g;
                C87412m.m108594g(view, "view");
                view.setTag(C0966R.C0970id.f5653kz, C76577a.m92166q(view.getContext(), C0966R.string.f7535iz));
                Bundle bundle = new Bundle();
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", false);
                this.f329714a.f329705e.mo14585p(C101198e.C101199b.EDIT_SELECT_LYRICS, bundle);
                this.f329714a.f329705e.mo14585p(C101198e.C101199b.RECORD_UN_CLICK_MUSIC, (Bundle) null);
            } else if (audioCacheInfo.f163820o == 2) {
                this.f329714a.f329709i.mo161623a();
            } else {
                this.f329714a.f329706f.setVisibility(0);
                this.f329714a.f329710j = audioCacheInfo;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("EDIT_SELECT_MUSIC_PARCELABLE", audioCacheInfo);
                this.f329714a.f329705e.mo14585p(C101198e.C101199b.EDIT_SELECT_MUSIC, bundle2);
                this.f329714a.f329709i.mo161624b(audioCacheInfo);
                C110992d dVar = C110992d.f332425a;
                dVar.mo162677k("KEY_MUSIC_ID_INT", Integer.valueOf(audioCacheInfo.f163813e));
                dVar.mo162677k("KEY_MUSIC_INDEX_INT", Integer.valueOf(audioCacheInfo.f163821p == 4 ? 0 : audioCacheInfo.f163828w + 1));
                dVar.mo162677k("KEY_MUSIC_REQ_ID_INT", Long.valueOf(audioCacheInfo.f163829x));
                if (audioCacheInfo.f163821p == 4) {
                    i = 1;
                }
                dVar.mo162677k("KEY_SEARCH_MUSIC_INT", Integer.valueOf(i));
                View view2 = this.f329714a.f329707g;
                C87412m.m108594g(view2, "view");
                view2.setTag(C0966R.C0970id.f5653kz, C76577a.m92166q(view2.getContext(), C0966R.string.f7534iy));
                C108745d.C108746a aVar2 = C108745d.f325632h;
                C108745d dVar2 = C108745d.f325633i;
                if (dVar2 != null) {
                    dVar2.mo159767c(audioCacheInfo.f163813e, audioCacheInfo.f163821p);
                }
            }
        }

        /* renamed from: d */
        public void mo151425d(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN", z);
            this.f329714a.f329705e.mo14585p(C101198e.C101199b.EDIT_SET_ORIGIN_MUTE, bundle);
        }

        /* renamed from: e */
        public void mo151426e() {
            this.f329714a.f329709i.mo161623a();
        }

        /* renamed from: f */
        public void mo151427f(boolean z, List<? extends C49044cs2> list) {
            C87412m.m108594g(list, "lyricsInfos");
            if (!list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EDIT_SELECT_MUSIC_LYRICS_LIST", new LyricsInfo(list));
                bundle.putBoolean("EDIT_SELECT_MUSIC_LYRICS_BOOLEAN", z);
                this.f329714a.f329705e.mo14585p(C101198e.C101199b.EDIT_SELECT_LYRICS, bundle);
            }
        }
    }

    public C110214a(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f329704d = viewGroup;
        this.f329705e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.cbm);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.editor_add_audio)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f329704d.findViewById(C0966R.C0970id.cbn);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.editor_add_audio_check)");
        ImageView imageView2 = (ImageView) findViewById2;
        this.f329706f = imageView2;
        View findViewById3 = this.f329704d.findViewById(C0966R.C0970id.cbo);
        C87412m.m108593f(findViewById3, "parent.findViewById(R.id.editor_add_audio_group)");
        this.f329707g = findViewById3;
        View findViewById4 = this.f329704d.findViewById(C0966R.C0970id.cc5);
        C87412m.m108593f(findViewById4, "parent.findViewById(R.id.editor_audio_panel)");
        EditorAudioView editorAudioView = (EditorAudioView) findViewById4;
        this.f329708h = editorAudioView;
        Context context = this.f329704d.getContext();
        C87412m.m108593f(context, "parent.context");
        this.f329709i = new C110218c(context);
        this.f329711n = new C107541d();
        this.f329712o = true;
        this.f329712o = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_show_mediacomponent_audio, true);
        Log.m105924i("MicroMsg.EditAddMusicPlugin", "forceEnable " + this.f329712o);
        imageView2.setImageDrawable(this.f329704d.getContext().getResources().getDrawable(C0966R.raw.popvideo_post_selected));
        imageView.setImageDrawable(C74933u4.m89768e(this.f329704d.getContext(), C0966R.raw.icons_filled_music, -1));
        imageView.setOnClickListener(this);
        if (this.f329712o) {
            editorAudioView.setOnVisibleChangeCallback(new C110215a(this));
            editorAudioView.setCallback(new C110216b(this));
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public static void m149813d(C110214a aVar, Integer num, Integer num2, String str, int i, int i2, Object obj) {
        C110214a aVar2 = aVar;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        EditorAudioView editorAudioView = aVar2.f329708h;
        Integer valueOf = Integer.valueOf(C0966R.C0969drawable.b9l);
        Integer valueOf2 = Integer.valueOf(C0966R.color.f2975b6);
        EditorAudioView.m142568q(editorAudioView, num, num2, str, valueOf, valueOf2, Integer.valueOf(C0966R.raw.ui_rescoures_checkbox_selected), valueOf2, Integer.valueOf(C0966R.C0969drawable.f4533f9), Integer.valueOf(C0966R.raw.icons_filled_music), Integer.valueOf(C0966R.color.aeg), Integer.valueOf(C0966R.color.aen), Integer.valueOf(C0966R.color.aek), Integer.valueOf(C0966R.C0969drawable.f4540fg), false, 8192, (Object) null);
        if (i3 != -1) {
            aVar2.f329706f.setImageDrawable(aVar2.f329704d.getContext().getResources().getDrawable(i3));
        }
    }

    /* renamed from: a */
    public final void mo161618a(int i, ArrayList<AudioCacheInfo> arrayList) {
        C87412m.m108594g(arrayList, "audioList");
        EditorAudioView editorAudioView = this.f329708h;
        editorAudioView.getClass();
        editorAudioView.f315524H.mo163965g5(arrayList);
        if (arrayList.size() > i) {
            RecyclerView recyclerView = editorAudioView.f315540j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioListForAudioCache", "(ILjava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioListForAudioCache", "(ILjava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
            editorAudioView.mo151399r(i, false);
        }
        editorAudioView.f315527K = true;
    }

    /* renamed from: b */
    public final void mo161619b() {
        C107541d dVar = this.f329711n;
        if (dVar.f321753f == C107543l.StoryComm && dVar.f321752e) {
            this.f329708h.setShow(true);
        }
    }

    /* renamed from: c */
    public final boolean mo161620c() {
        return this.f329708h.getMuteOrigin();
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!this.f329708h.mo151395m()) {
            return false;
        }
        this.f329708h.mo151390h();
        return true;
    }

    public String name() {
        return C110214a.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!WeChatBrands.Business.Entries.SessionMusic.checkAvailable(view != null ? view.getContext() : null)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f329708h.setShow(true);
        C110992d dVar = C110992d.f332425a;
        C110992d.m151314c(dVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, (Object) null);
        dVar.mo162669b(6);
        dVar.mo162670d(5);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
        this.f329708h.mo151398p();
        C108745d.C108746a aVar = C108745d.f325632h;
        C108745d dVar = C108745d.f325633i;
        if (dVar != null) {
            dVar.mo159765a();
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        this.f329709i.mo161623a();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        if (this.f329708h.getWithMusic()) {
            Log.m105924i("MicroMsg.EditAddMusicPlugin", "resumeMusic");
            C110218c cVar = this.f329709i;
            Log.m105924i(cVar.f329717a, "resume music");
            C60700d dVar = cVar.f329718b;
            if (dVar != null) {
                dVar.mo85619m();
            }
        }
    }

    public void release() {
        reset();
        this.f329710j = null;
        this.f329709i.mo161626d();
        this.f329708h.mo151393k();
    }

    public void reset() {
        this.f329706f.setVisibility(8);
        View view = this.f329707g;
        C87412m.m108594g(view, "view");
        view.setTag(C0966R.C0970id.f5653kz, C76577a.m92166q(view.getContext(), C0966R.string.f7535iz));
    }

    public void setVisibility(int i) {
        if (this.f329712o) {
            View view = this.f329707g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/music/EditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
