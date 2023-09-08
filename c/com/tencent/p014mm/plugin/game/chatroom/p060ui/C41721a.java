package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.content.Context;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TimerTask;
import js0.C88024r;
import lu3.C34379c;
import yw1.C53601h;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.a */
public final class C41721a {

    /* renamed from: a */
    public final Context f112291a;

    /* renamed from: b */
    public boolean f112292b;

    /* renamed from: c */
    public boolean f112293c;

    /* renamed from: d */
    public long f112294d;

    /* renamed from: e */
    public final Queue<JumpInfo> f112295e = new ArrayDeque();

    /* renamed from: f */
    public C34379c<?> f112296f;

    /* renamed from: g */
    public final TimerTask f112297g = new C41722a(this);

    /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.a$a */
    public static final class C41722a extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C41721a f112298d;

        /* renamed from: com.tencent.mm.plugin.game.chatroom.ui.a$a$a */
        public static final class C41723a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C41721a f112299d;

            public C41723a(C41721a aVar) {
                this.f112299d = aVar;
            }

            public final void run() {
                C41721a aVar = this.f112299d;
                if (!aVar.f112293c && !aVar.f112292b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C41721a aVar2 = this.f112299d;
                    if (currentTimeMillis - aVar2.f112294d >= 10000) {
                        aVar2.f112292b = true;
                        JumpInfo jumpInfo = (JumpInfo) ((ArrayDeque) aVar2.f112295e).poll();
                        if (((ArrayDeque) aVar2.f112295e).isEmpty()) {
                            C34379c<?> cVar = aVar2.f112296f;
                            if (cVar != null) {
                                cVar.cancel(false);
                            }
                            aVar2.f112296f = null;
                        }
                        aVar2.f112294d = System.currentTimeMillis();
                        C53601h.m60130i(aVar2.f112291a, jumpInfo, 15, (String) null);
                    }
                }
            }
        }

        public C41722a(C41721a aVar) {
            this.f112298d = aVar;
        }

        public void run() {
            C88024r.m109572b(new C41723a(this.f112298d));
        }
    }

    public C41721a(Context context) {
        C87412m.m108594g(context, "context");
        this.f112291a = context;
    }
}
