package p935cb;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p547hb.C87470h;
import p935cb.C79980i;

/* renamed from: cb.g */
public class C79977g extends AppCompatTextView {

    /* renamed from: g */
    public final List<C79985j> f234258g = new ArrayList(4);

    /* renamed from: h */
    public StringBuilder f234259h = new StringBuilder(100);

    /* renamed from: i */
    public C79980i.C79983c f234260i = null;

    /* renamed from: j */
    public MTimerHandler f234261j = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C79978a(), true);

    /* renamed from: cb.g$a */
    public class C79978a implements MTimerHandler.CallBack {
        public C79978a() {
        }

        public boolean onTimerExpired() {
            ((ArrayList) C79977g.this.f234258g).clear();
            C79977g gVar = C79977g.this;
            C79980i.C79983c cVar = gVar.f234260i;
            if (cVar != null) {
                List<C79985j> list = gVar.f234258g;
                C87470h hVar = (C87470h) cVar;
                hVar.getClass();
                try {
                    hVar.f253469b.mo111267l0(hVar.f253468a.mo120910U(), list);
                } catch (Exception unused) {
                }
            }
            C79977g gVar2 = C79977g.this;
            List<C79985j> list2 = gVar2.f234258g;
            gVar2.f234259h.setLength(0);
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                C79985j jVar = (C79985j) it.next();
                StringBuilder sb = gVar2.f234259h;
                sb.append(jVar.f234276a);
                sb.append(": ");
                sb.append(jVar.f234277b);
                sb.append("\n");
            }
            gVar2.setText(gVar2.f234259h);
            return true;
        }
    }

    public C79977g(Context context) {
        super(context, (AttributeSet) null);
        setTextSize(12.0f);
        setTextColor(-65536);
        setFocusable(false);
        setClickable(false);
        setOnClickListener((View.OnClickListener) null);
        this.f234261j.startTimer(1000);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
