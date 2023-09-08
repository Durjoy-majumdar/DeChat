package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.DrawnCallBackLinearLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.tools.TestTimeForChatting */
public class TestTimeForChatting extends DrawnCallBackLinearLayout {

    /* renamed from: d */
    public int f220057d = 0;

    /* renamed from: e */
    public C74844b f220058e;

    /* renamed from: f */
    public int f220059f = 0;

    /* renamed from: g */
    public int f220060g = 0;

    /* renamed from: com.tencent.mm.ui.tools.TestTimeForChatting$a */
    public class C74843a implements Runnable {
        public C74843a() {
        }

        public void run() {
            C74844b bVar = TestTimeForChatting.this.f220058e;
            if (bVar != null) {
                bVar.mo101521a();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.TestTimeForChatting$b */
    public interface C74844b {
        /* renamed from: a */
        void mo101521a();
    }

    public TestTimeForChatting(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo104056a() {
        Log.m105925i("MicroMsg.TestTimeForChatting", "klem frameCount:%d", Integer.valueOf(this.f220057d));
        C115669n.INSTANCE.mo160131h(11198, Integer.valueOf(this.f220057d));
    }

    /* renamed from: b */
    public void mo104057b() {
        Log.m105925i("MicroMsg.TestTimeForChatting", "start chatting response time: %dms", Long.valueOf(System.currentTimeMillis() - 0));
        this.f220057d = 0;
    }

    public void dispatchDraw(Canvas canvas) {
        this.f220057d++;
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TestTimeForChatting", th, "dispatchDraw", new Object[0]);
        }
        C85405m.m105412b(9);
        C85405m.m105412b(18);
        C85405m.m105412b(25);
        C85405m.m105412b(24);
        C85405m.m105412b(20);
        C85405m.m105412b(18);
        if (this.f220058e != null) {
            post(new C74843a());
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        Log.m105919d("MicroMsg.TestTimeForChatting", "ashu::fitSystemWindows: %s, fixBottomPadding:%d fixRightPadding:%d", rect.toString(), Integer.valueOf(this.f220059f), Integer.valueOf(this.f220060g));
        rect.bottom += this.f220059f;
        rect.right += this.f220060g;
        return super.fitSystemWindows(rect);
    }

    public void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onDraw(canvas);
        Log.m105924i("MicroMsg.TestTimeForChatting", (System.currentTimeMillis() - currentTimeMillis) + "");
    }

    public void setOndispatchDraw(C74844b bVar) {
        this.f220058e = bVar;
    }

    public TestTimeForChatting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
