package kf1;

import android.widget.ScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RCConstraintLayout;
import gy3.C87412m;

/* renamed from: kf1.c4 */
public final class C9667c4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9765h4 f30035d;

    public C9667c4(C9765h4 h4Var) {
        this.f30035d = h4Var;
    }

    public final void run() {
        ScrollView scrollView = this.f30035d.f30244E;
        if (scrollView != null) {
            int height = scrollView.getHeight();
            ScrollView scrollView2 = this.f30035d.f30244E;
            if (scrollView2 != null) {
                int width = scrollView2.getWidth();
                String str = this.f30035d.f30265d;
                StringBuilder sb = new StringBuilder();
                sb.append("#fixContentLayoutSize realSpace=");
                sb.append(height);
                sb.append(" height=");
                RCConstraintLayout rCConstraintLayout = this.f30035d.f30269h;
                if (rCConstraintLayout != null) {
                    sb.append(rCConstraintLayout.getHeight());
                    sb.append(" realWidthSpace=");
                    sb.append(width);
                    sb.append(" width=");
                    RCConstraintLayout rCConstraintLayout2 = this.f30035d.f30269h;
                    if (rCConstraintLayout2 != null) {
                        sb.append(rCConstraintLayout2.getWidth());
                        Log.m105924i(str, sb.toString());
                        if (height > 0) {
                            RCConstraintLayout rCConstraintLayout3 = this.f30035d.f30269h;
                            if (rCConstraintLayout3 == null) {
                                C87412m.m108603p("concertTicketViewRoot");
                                throw null;
                            } else if (rCConstraintLayout3.getHeight() > 0 && width > 0) {
                                RCConstraintLayout rCConstraintLayout4 = this.f30035d.f30269h;
                                if (rCConstraintLayout4 == null) {
                                    C87412m.m108603p("concertTicketViewRoot");
                                    throw null;
                                } else if (rCConstraintLayout4.getWidth() > 0) {
                                    float f = (float) height;
                                    RCConstraintLayout rCConstraintLayout5 = this.f30035d.f30269h;
                                    if (rCConstraintLayout5 != null) {
                                        float height2 = f / ((float) rCConstraintLayout5.getHeight());
                                        float f2 = (float) width;
                                        RCConstraintLayout rCConstraintLayout6 = this.f30035d.f30269h;
                                        if (rCConstraintLayout6 != null) {
                                            float min = Math.min(height2, f2 / ((float) rCConstraintLayout6.getWidth()));
                                            String str2 = this.f30035d.f30265d;
                                            Log.m105924i(str2, "#fixContentLayoutScale " + min);
                                            if (min < 1.0f) {
                                                RCConstraintLayout rCConstraintLayout7 = this.f30035d.f30269h;
                                                if (rCConstraintLayout7 != null) {
                                                    rCConstraintLayout7.setScaleX(min);
                                                    RCConstraintLayout rCConstraintLayout8 = this.f30035d.f30269h;
                                                    if (rCConstraintLayout8 != null) {
                                                        rCConstraintLayout8.setScaleY(min);
                                                    } else {
                                                        C87412m.m108603p("concertTicketViewRoot");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("concertTicketViewRoot");
                                                    throw null;
                                                }
                                            } else {
                                                RCConstraintLayout rCConstraintLayout9 = this.f30035d.f30269h;
                                                if (rCConstraintLayout9 != null) {
                                                    rCConstraintLayout9.setScaleX(1.0f);
                                                    RCConstraintLayout rCConstraintLayout10 = this.f30035d.f30269h;
                                                    if (rCConstraintLayout10 != null) {
                                                        rCConstraintLayout10.setScaleY(1.0f);
                                                    } else {
                                                        C87412m.m108603p("concertTicketViewRoot");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("concertTicketViewRoot");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            C87412m.m108603p("concertTicketViewRoot");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("concertTicketViewRoot");
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else {
                        C87412m.m108603p("concertTicketViewRoot");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("concertTicketViewRoot");
                    throw null;
                }
            } else {
                C87412m.m108603p("sv");
                throw null;
            }
        } else {
            C87412m.m108603p("sv");
            throw null;
        }
    }
}
