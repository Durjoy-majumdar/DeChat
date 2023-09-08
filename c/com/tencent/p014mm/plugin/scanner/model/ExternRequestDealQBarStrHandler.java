package com.tencent.p014mm.plugin.scanner.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Point;
import android.os.Bundle;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.autogen.events.ReleaseDealQBarStrEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.ScanIdentifyReportInfo;
import f40.C86709a0;
import ml2.C10931f;
import te3.C51694vh;
import vl2.C102209c;
import vl2.C102210d;
import vl2.C102212j;

/* renamed from: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler */
public class ExternRequestDealQBarStrHandler extends IStaticListener<IEvent> {

    /* renamed from: i */
    public static String f273141i;

    /* renamed from: j */
    public static Activity f273142j;

    /* renamed from: n */
    public static C102212j f273143n;

    /* renamed from: d */
    public C102210d f273144d;

    /* renamed from: e */
    public C10931f.C10933a f273145e = new C94473a(this);

    /* renamed from: f */
    public IListener<DealQBarStrEvent> f273146f;

    /* renamed from: g */
    public IListener<CancelDealQBarStrEvent> f273147g;

    /* renamed from: h */
    public IListener<ReleaseDealQBarStrEvent> f273148h;

    /* renamed from: com.tencent.mm.plugin.scanner.model.ExternRequestDealQBarStrHandler$a */
    public class C94473a implements C10931f.C10933a {
        public C94473a(ExternRequestDealQBarStrHandler externRequestDealQBarStrHandler) {
        }

        /* renamed from: b */
        public void mo361b(int i, Bundle bundle) {
            Log.m105925i("MicroMsg.ExternRequestDealQBarStrHandler", "Deal QBar String notify, id:%d", Integer.valueOf(i));
            NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = new NotifyDealQBarStrResultEvent();
            NotifyDealQBarStrResultEvent.C92533a aVar = notifyDealQBarStrResultEvent.f264935d;
            aVar.f264938c = i;
            aVar.f264937b = ExternRequestDealQBarStrHandler.f273142j;
            aVar.f264936a = ExternRequestDealQBarStrHandler.f273141i;
            aVar.f264939d = bundle;
            notifyDealQBarStrResultEvent.publish();
        }
    }

    public ExternRequestDealQBarStrHandler() {
        C40008f fVar = C40008f.f107254d;
        this.f273146f = new IListener<DealQBarStrEvent>(fVar) {
            {
                this.__eventId = 1907055527;
            }

            public boolean callback(IEvent iEvent) {
                DealQBarStrEvent dealQBarStrEvent = (DealQBarStrEvent) iEvent;
                if (dealQBarStrEvent != null) {
                    ExternRequestDealQBarStrHandler.m119495d();
                    DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
                    ExternRequestDealQBarStrHandler.f273141i = aVar.f264649a;
                    Activity activity = aVar.f264650b;
                    ExternRequestDealQBarStrHandler.f273142j = activity;
                    if (activity instanceof MMActivity) {
                        ((MMActivity) activity).getLifecycle().addObserver(new C0124r(this) {
                            @C112974b0(C39623j.C39625b.ON_DESTROY)
                            public void onDestroy() {
                                Activity activity = ExternRequestDealQBarStrHandler.f273142j;
                                if (activity != null) {
                                    Log.m105925i("MicroMsg.ExternRequestDealQBarStrHandler", "auto release for %s", activity.getClass().getName());
                                    ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new ReleaseDealQBarStrEvent();
                                    releaseDealQBarStrEvent.f265057d.f265058a = ExternRequestDealQBarStrHandler.f273142j;
                                    releaseDealQBarStrEvent.publish();
                                }
                            }
                        });
                    }
                    Log.m105925i("MicroMsg.ExternRequestDealQBarStrHandler", "request deal qbar, activity:%s, str:%s, codeType %d, codeVersion: %s, from : %d", ExternRequestDealQBarStrHandler.f273142j, ExternRequestDealQBarStrHandler.f273141i, Integer.valueOf(dealQBarStrEvent.f264648d.f264651c), Integer.valueOf(dealQBarStrEvent.f264648d.f264652d), Integer.valueOf(dealQBarStrEvent.f264648d.f264655g));
                    DealQBarStrEvent.C92468a aVar2 = dealQBarStrEvent.f264648d;
                    int i = aVar2.f264651c;
                    if (i == 19 || i == 22) {
                        C102212j jVar = new C102212j();
                        ExternRequestDealQBarStrHandler.f273143n = jVar;
                        DealQBarStrEvent.C92468a aVar3 = dealQBarStrEvent.f264648d;
                        jVar.f300950w = aVar3.f264653e;
                        jVar.f300951x = aVar3.f264658j;
                        jVar.f300952y = aVar3.f264659k;
                        jVar.f300953z = aVar3.f264654f;
                        Bundle bundle = aVar3.f264660l;
                        if (!(bundle == null || bundle.getString("stat_send_msg_user") == null)) {
                            ExternRequestDealQBarStrHandler.f273143n.f300929C = dealQBarStrEvent.f264648d.f264660l.getString("stat_send_msg_user");
                        }
                        DealQBarStrEvent.C92468a aVar4 = dealQBarStrEvent.f264648d;
                        int i2 = aVar4.f264655g < 0 ? 2 : 3;
                        int i3 = aVar4.f264657i;
                        if (i3 > 0) {
                            ExternRequestDealQBarStrHandler.f273143n.f300928B = i3;
                        }
                        if (i2 == 3) {
                            ExternRequestDealQBarStrHandler.f273143n.f300927A = aVar4.f264656h;
                        }
                        ExternRequestDealQBarStrHandler.f273143n.mo141742e(ExternRequestDealQBarStrHandler.f273142j, ExternRequestDealQBarStrHandler.f273141i, i2, i3, "", aVar4.f264651c, aVar4.f264652d, ExternRequestDealQBarStrHandler.this.f273145e, (C94528d) null, aVar4.f264660l, 0, false, -1, false, new ScanIdentifyReportInfo((byte[]) null, (Point) null, aVar4.f264661m));
                    } else {
                        ExternRequestDealQBarStrHandler externRequestDealQBarStrHandler = ExternRequestDealQBarStrHandler.this;
                        C102210d dVar = new C102210d();
                        externRequestDealQBarStrHandler.f273144d = dVar;
                        Activity activity2 = ExternRequestDealQBarStrHandler.f273142j;
                        C10931f.C10933a aVar5 = externRequestDealQBarStrHandler.f273145e;
                        String str = ExternRequestDealQBarStrHandler.f273141i;
                        int i4 = aVar2.f264652d;
                        Bundle bundle2 = aVar2.f264660l;
                        if (!Util.isNullOrNil(str)) {
                            dVar.f300907e = activity2;
                            dVar.f300908f = bundle2;
                            dVar.f300919t = aVar5;
                            dVar.f300909g = 0;
                            dVar.f300917r = false;
                            C42910u uVar = new C42910u(i, str, i4, 2, 0, (C51694vh) null);
                            C86709a0.m107524d().mo123455a(1061, dVar);
                            C86709a0.m107524d().mo123460f(uVar);
                            dVar.mo141738c(activity2.getString(C0966R.string.hqi), new C102209c(dVar, uVar));
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a DealQBarStrEvent instance");
                }
                return false;
            }
        };
        this.f273147g = new IListener<CancelDealQBarStrEvent>(this, fVar) {
            {
                this.__eventId = 1615476289;
            }

            public boolean callback(IEvent iEvent) {
                CancelDealQBarStrEvent cancelDealQBarStrEvent = (CancelDealQBarStrEvent) iEvent;
                if (cancelDealQBarStrEvent != null) {
                    Log.m105925i("MicroMsg.ExternRequestDealQBarStrHandler", "cancel deal qbar, activity:%s, str:%s", ExternRequestDealQBarStrHandler.f273142j, ExternRequestDealQBarStrHandler.f273141i);
                    CancelDealQBarStrEvent.C92466a aVar = cancelDealQBarStrEvent.f264642d;
                    if (aVar.f264644b != ExternRequestDealQBarStrHandler.f273142j || !aVar.f264643a.equals(ExternRequestDealQBarStrHandler.f273141i)) {
                        Log.m105920e("MicroMsg.ExternRequestDealQBarStrHandler", "not same as string that are dealing");
                    } else {
                        ExternRequestDealQBarStrHandler.m119495d();
                    }
                } else {
                    Log.m105920e("MicroMsg.ExternRequestDealQBarStrHandler", "event is null or not a CancelDealQBarStrEvent instance");
                }
                return false;
            }
        };
        this.f273148h = new IListener<ReleaseDealQBarStrEvent>(fVar) {
            {
                this.__eventId = -1623890066;
            }

            public boolean callback(IEvent iEvent) {
                ReleaseDealQBarStrEvent releaseDealQBarStrEvent = (ReleaseDealQBarStrEvent) iEvent;
                if (releaseDealQBarStrEvent == null || releaseDealQBarStrEvent.f265057d.f265058a != ExternRequestDealQBarStrHandler.f273142j) {
                    return false;
                }
                ExternRequestDealQBarStrHandler.f273142j = null;
                C102212j jVar = ExternRequestDealQBarStrHandler.f273143n;
                if (jVar != null && jVar.mo141745i() == releaseDealQBarStrEvent.f265057d.f265058a) {
                    Log.m105918d("MicroMsg.ExternRequestDealQBarStrHandler", "alvinluo releaseDealQBarStr set qbarStringHandle activity null");
                    ExternRequestDealQBarStrHandler.f273143n.mo141751o();
                }
                C102210d dVar = ExternRequestDealQBarStrHandler.this.f273144d;
                if (dVar == null || dVar.f300907e != releaseDealQBarStrEvent.f265057d.f265058a) {
                    return false;
                }
                Log.m105918d("MicroMsg.ExternRequestDealQBarStrHandler", "alvinluo releaseDealQBarStr set barCodeStringHandle activity null");
                C102210d dVar2 = ExternRequestDealQBarStrHandler.this.f273144d;
                dVar2.f300907e = null;
                ProgressDialog progressDialog = dVar2.f300906d;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                dVar2.f300906d = null;
                return false;
            }
        };
    }

    /* renamed from: d */
    public static void m119495d() {
        C102212j jVar = f273143n;
        if (jVar != null) {
            jVar.mo141740c();
            f273143n = null;
        }
        f273142j = null;
        f273141i = null;
    }

    public boolean callback(IEvent iEvent) {
        if (iEvent instanceof DealQBarStrEvent) {
            return this.f273146f.callback((DealQBarStrEvent) iEvent);
        }
        if (iEvent instanceof CancelDealQBarStrEvent) {
            return this.f273147g.callback((CancelDealQBarStrEvent) iEvent);
        }
        if (iEvent instanceof ReleaseDealQBarStrEvent) {
            return this.f273148h.callback((ReleaseDealQBarStrEvent) iEvent);
        }
        return false;
    }
}
