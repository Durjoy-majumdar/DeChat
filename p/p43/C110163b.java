package p43;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: p43.b */
public class C110163b {

    /* renamed from: a */
    public int[] f329572a;

    /* renamed from: b */
    public TextView f329573b;

    /* renamed from: c */
    public int f329574c;

    /* renamed from: d */
    public MTimerHandler f329575d = new MTimerHandler(new C110164a(), true);

    /* renamed from: p43.b$a */
    public class C110164a implements MTimerHandler.CallBack {
        public C110164a() {
        }

        public boolean onTimerExpired() {
            C110163b bVar = C110163b.this;
            int[] iArr = bVar.f329572a;
            int i = iArr[bVar.f329574c % iArr.length];
            TextView textView = bVar.f329573b;
            if (textView != null) {
                if (-1 == i) {
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(i);
                }
            }
            C110163b.this.f329574c++;
            return true;
        }
    }

    /* renamed from: a */
    public void mo161577a() {
        MTimerHandler mTimerHandler = this.f329575d;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        Log.printDebugStack("MicroMsg.DynamicTextWrap", "stop textview: " + this.f329573b, new Object[0]);
        this.f329573b = null;
    }
}
