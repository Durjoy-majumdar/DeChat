package xb3;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import lg3.C76695c;

/* renamed from: xb3.f */
public final class C15633f implements MMFragmentActivity$$e {

    /* renamed from: a */
    public final String f42257a;

    /* renamed from: b */
    public final View f42258b;

    /* renamed from: c */
    public ArrayList<Long> f42259c = new ArrayList<>(4);

    /* renamed from: d */
    public final Rect f42260d = new Rect();

    public C15633f(String str, View view) {
        C87412m.m108594g(str, "viewId");
        C87412m.m108594g(view, "targetView");
        this.f42257a = str;
        this.f42258b = view;
    }

    /* renamed from: a */
    public void mo14377a(MotionEvent motionEvent) {
        String str;
        String str2;
        if (motionEvent != null) {
            int i = 1;
            if (motionEvent.getAction() == 1) {
                this.f42258b.getGlobalVisibleRect(this.f42260d);
                if (this.f42258b.isShown() && this.f42260d.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f42259c.add(Long.valueOf(motionEvent.getEventTime()));
                    while (this.f42259c.size() > 3) {
                        this.f42259c.remove(0);
                    }
                    if (this.f42259c.size() == 3) {
                        long longValue = this.f42259c.get(2).longValue();
                        Long l = this.f42259c.get(0);
                        C87412m.m108593f(l, "recentClickTime[0]");
                        long longValue2 = longValue - l.longValue();
                        if (longValue2 <= 1000) {
                            Log.m105928w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "hit max threshold: " + longValue2 + ", " + this.f42259c);
                            View view = this.f42258b;
                            String str3 = this.f42257a;
                            if (!view.isEnabled()) {
                                str = "1";
                                str2 = "view is not enabled";
                            } else if (!view.isClickable()) {
                                str = "2";
                                str2 = "view is not clickable";
                            } else if (!view.hasOnClickListeners()) {
                                str2 = "view has not click listener";
                                str = "3";
                            } else {
                                str = "9999";
                                str2 = "common reason";
                            }
                            Log.m105924i("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "btn no response: " + str3 + ", " + str);
                            C87412m.m108594g(str3, "viewId");
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[8];
                            objArr[0] = "3";
                            objArr[1] = str3;
                            objArr[2] = str;
                            objArr[3] = str2;
                            objArr[4] = "";
                            objArr[5] = Integer.valueOf(C85875k4.m106211z() ? 1 : 0);
                            objArr[6] = Integer.valueOf(C76695c.m92341b() ? 1 : 0);
                            if (C76577a.m92165p(MMApplicationContext.getContext()) <= 1.0f) {
                                i = 0;
                            }
                            objArr[7] = Integer.valueOf(i);
                            nVar.mo160131h(24610, objArr);
                            this.f42259c.clear();
                        }
                    }
                }
            }
        }
    }

    public String key() {
        return this.f42257a;
    }
}
