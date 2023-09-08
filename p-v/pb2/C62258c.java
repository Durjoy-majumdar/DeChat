package pb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.open.text_status.MusicMvView;
import hb2.C59822f;
import te3.C50008jm0;

/* renamed from: pb2.c */
public final class C62258c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMvView f176970d;

    /* renamed from: e */
    public final /* synthetic */ C50008jm0 f176971e;

    /* renamed from: f */
    public final /* synthetic */ C59822f f176972f;

    public C62258c(MusicMvView musicMvView, C50008jm0 jm02, C59822f fVar) {
        this.f176970d = musicMvView;
        this.f176971e = jm02;
        this.f176972f = fVar;
    }

    public final void run() {
        MusicMvView.m65672b(this.f176970d, this.f176971e, this.f176972f.hashCode());
    }
}
