package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import bh2.C104110c;
import bh2.C104112d;
import bh2.C104136w;
import bh2.C92259v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lu3.C88656g;
import yh2.C112464o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView;", "Landroid/view/TextureView;", "", "getCurPos", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView$a;", "h", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView$a;", "getCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView$a;", "setCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView */
public final class StoryFakeVideoPlayView extends TextureView {

    /* renamed from: o */
    public static final /* synthetic */ int f315669o = 0;

    /* renamed from: d */
    public C104110c f315670d;

    /* renamed from: e */
    public C104136w f315671e = new C104136w();

    /* renamed from: f */
    public C106050b f315672f = C106050b.STOP;

    /* renamed from: g */
    public boolean f315673g;

    /* renamed from: h */
    public C106049a f315674h;

    /* renamed from: i */
    public int f315675i;

    /* renamed from: j */
    public C106051c f315676j;

    /* renamed from: n */
    public List<String> f315677n;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView$a */
    public interface C106049a {
        void onPrepared();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView$b */
    public enum C106050b {
        STOP,
        PLAYING,
        PAUSE
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView$c */
    public final class C106051c implements C88656g {

        /* renamed from: d */
        public ArrayList<String> f315682d;

        /* renamed from: e */
        public boolean f315683e;

        /* renamed from: f */
        public final /* synthetic */ StoryFakeVideoPlayView f315684f;

        /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView$c$a */
        public static final class C106052a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryFakeVideoPlayView f315685d;

            public C106052a(StoryFakeVideoPlayView storyFakeVideoPlayView) {
                this.f315685d = storyFakeVideoPlayView;
            }

            public final void run() {
                C104136w wVar = this.f315685d.f315671e;
                if (wVar != null) {
                    wVar.f308126c = 0;
                } else {
                    C87412m.m108603p(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
                    throw null;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView$c$b */
        public static final class C106053b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryFakeVideoPlayView f315686d;

            public C106053b(StoryFakeVideoPlayView storyFakeVideoPlayView) {
                this.f315686d = storyFakeVideoPlayView;
            }

            public final void run() {
                C106049a callback = this.f315686d.getCallback();
                if (callback != null) {
                    callback.onPrepared();
                }
                this.f315686d.setCallback((C106049a) null);
            }
        }

        public C106051c(StoryFakeVideoPlayView storyFakeVideoPlayView, ArrayList<String> arrayList) {
            C87412m.m108594g(arrayList, "imageList");
            this.f315684f = storyFakeVideoPlayView;
            this.f315682d = arrayList;
        }

        public String getKey() {
            return "Story_VideoLoopTask";
        }

        public void run() {
            StoryFakeVideoPlayView storyFakeVideoPlayView;
            C106050b bVar = C106050b.PLAYING;
            this.f315684f.f315672f = bVar;
            while (true) {
                storyFakeVideoPlayView = this.f315684f;
                if (storyFakeVideoPlayView.f315673g) {
                    break;
                }
                Thread.sleep(100);
            }
            C104136w wVar = storyFakeVideoPlayView.f315671e;
            if (wVar != null) {
                C92259v vVar = wVar.f308128e;
                synchronized (vVar) {
                    Log.m105924i("MicroMsg.Story.StoryImagePlayer", "clearImages");
                    vVar.f264056a.clear();
                }
                C104136w wVar2 = this.f315684f.f315671e;
                if (wVar2 != null) {
                    wVar2.mo145778a(this.f315682d);
                    if (!this.f315683e) {
                        while (!this.f315683e) {
                            StoryFakeVideoPlayView storyFakeVideoPlayView2 = this.f315684f;
                            C106050b bVar2 = storyFakeVideoPlayView2.f315672f;
                            if (bVar2 != bVar || !storyFakeVideoPlayView2.f315673g) {
                                if (bVar2 != C106050b.PAUSE) {
                                    if (bVar2 != bVar || storyFakeVideoPlayView2.f315673g) {
                                        break;
                                    }
                                    Thread.sleep(500);
                                } else {
                                    storyFakeVideoPlayView2.getClass();
                                    Thread.sleep(500);
                                }
                            } else {
                                int i = 0;
                                C104110c cVar = storyFakeVideoPlayView2.f315670d;
                                if (cVar != null) {
                                    cVar.mo145762a(new C106052a(storyFakeVideoPlayView2));
                                    while (true) {
                                        int i2 = i + 1;
                                        if (i >= 1000 || this.f315683e) {
                                            break;
                                        }
                                        StoryFakeVideoPlayView storyFakeVideoPlayView3 = this.f315684f;
                                        long j = 1000 / ((long) 15);
                                        storyFakeVideoPlayView3.f315675i = (int) (((long) i2) * j);
                                        if (storyFakeVideoPlayView3.f315672f != bVar) {
                                            continue;
                                            break;
                                        }
                                        C104110c cVar2 = storyFakeVideoPlayView3.f315670d;
                                        if (cVar2 != null) {
                                            Log.m105924i("MicroMsg.Story.GLThread", "requestRender");
                                            MMHandler mMHandler = cVar2.f308031f;
                                            if (mMHandler == null) {
                                                Log.m105924i("MicroMsg.Story.GLThread", "requestRender but handler is null");
                                            } else {
                                                mMHandler.post(new C104112d(cVar2));
                                            }
                                            if (this.f315684f.getCallback() != null) {
                                                StoryFakeVideoPlayView storyFakeVideoPlayView4 = this.f315684f;
                                                C104110c cVar3 = storyFakeVideoPlayView4.f315670d;
                                                if (cVar3 != null) {
                                                    cVar3.mo145762a(new C106053b(storyFakeVideoPlayView4));
                                                } else {
                                                    C87412m.m108603p("glThread");
                                                    throw null;
                                                }
                                            }
                                            Thread.sleep(j);
                                            i = i2;
                                        } else {
                                            C87412m.m108603p("glThread");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("glThread");
                                    throw null;
                                }
                            }
                        }
                        int i3 = StoryFakeVideoPlayView.f315669o;
                        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "video play end");
                        return;
                    }
                    return;
                }
                C87412m.m108603p(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
                throw null;
            }
            C87412m.m108603p(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryFakeVideoPlayView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C112464o(this));
    }

    /* renamed from: a */
    public final void mo151511a() {
        Log.m105924i("MicroMsg.Story.StoryFakeVideoPlayView", "stop");
        this.f315672f = C106050b.STOP;
        C106051c cVar = this.f315676j;
        if (cVar != null) {
            cVar.f315683e = true;
        }
    }

    public final C106049a getCallback() {
        return this.f315674h;
    }

    public final int getCurPos() {
        return this.f315675i;
    }

    public final void setCallback(C106049a aVar) {
        this.f315674h = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryFakeVideoPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setSurfaceTextureListener(new C112464o(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryFakeVideoPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C112464o(this));
    }
}
