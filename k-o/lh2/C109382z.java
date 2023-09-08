package lh2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.StoryFakeVideoPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import h90.C98324b;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.z */
public final class C109382z implements C109344g0 {

    /* renamed from: d */
    public StoryFakeVideoPlayView f327455d;

    /* renamed from: e */
    public C98324b f327456e;

    /* renamed from: f */
    public final C109383a f327457f;

    /* renamed from: lh2.z$a */
    public static final class C109383a implements StoryFakeVideoPlayView.C106049a {

        /* renamed from: a */
        public final /* synthetic */ C109382z f327458a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f327459b;

        /* renamed from: lh2.z$a$a */
        public static final class C109384a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C109382z f327460d;

            /* renamed from: e */
            public final /* synthetic */ C101198e f327461e;

            public C109384a(C109382z zVar, C101198e eVar) {
                this.f327460d = zVar;
                this.f327461e = eVar;
            }

            public final void run() {
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_VIDEO_NEED_CROP", false);
                this.f327460d.f327455d.setAlpha(0.99f);
                C101198e.C62622a.m73576a(this.f327461e, C101198e.C101199b.START_PLAY_VIDEO, (Bundle) null, 2, (Object) null);
                this.f327461e.mo14585p(C101198e.C101199b.EDIT_VIDEO_PREPARE, bundle);
                Log.m105924i("MicroMsg.EditPhotoToVideoPlugin", "setup fakeVideoPlayView onPrepared");
            }
        }

        public C109383a(C109382z zVar, C101198e eVar) {
            this.f327458a = zVar;
            this.f327459b = eVar;
        }

        public void onPrepared() {
            C109382z zVar = this.f327458a;
            zVar.f327455d.post(new C109384a(zVar, this.f327459b));
        }
    }

    public C109382z(StoryFakeVideoPlayView storyFakeVideoPlayView, C101198e eVar) {
        C87412m.m108594g(storyFakeVideoPlayView, "videoPlayView");
        C87412m.m108594g(eVar, "status");
        this.f327455d = storyFakeVideoPlayView;
        this.f327457f = new C109383a(this, eVar);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        this.f327455d.mo151511a();
        return false;
    }

    public String name() {
        return C109382z.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
        Log.m105924i("MicroMsg.EditPhotoToVideoPlugin", "onPause");
        StoryFakeVideoPlayView storyFakeVideoPlayView = this.f327455d;
        storyFakeVideoPlayView.getClass();
        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "pause");
        storyFakeVideoPlayView.f315672f = StoryFakeVideoPlayView.C106050b.PAUSE;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        ArrayList<String> arrayList;
        Log.m105924i("MicroMsg.EditPhotoToVideoPlugin", "onResume");
        C98324b bVar = this.f327456e;
        boolean z = false;
        if (!(bVar == null || (arrayList = bVar.f288190k) == null || arrayList.isEmpty())) {
            z = true;
        }
        if (z) {
            StoryFakeVideoPlayView storyFakeVideoPlayView = this.f327455d;
            storyFakeVideoPlayView.getClass();
            Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "resume");
            storyFakeVideoPlayView.f315672f = StoryFakeVideoPlayView.C106050b.PLAYING;
        }
    }

    public void release() {
        Log.m105924i("MicroMsg.EditPhotoToVideoPlugin", "release");
        this.f327455d.mo151511a();
        this.f327456e = null;
    }

    public void reset() {
        this.f327455d.mo151511a();
        this.f327456e = null;
    }

    public void setVisibility(int i) {
        this.f327455d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
