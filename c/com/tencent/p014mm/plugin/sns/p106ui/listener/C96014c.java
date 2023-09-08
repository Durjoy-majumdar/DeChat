package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.SnsfillEventInfoEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C96113p5;
import com.tencent.p014mm.plugin.sns.p106ui.C96230u;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import et2.C97707a;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.Map;
import jp2.C98963o;
import jp2.C98977w;
import ju2.C99043c;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100416r;
import os2.C100417r0;
import os2.C100420w;
import os2.C100421x;
import p740wo.C53193b;
import p749xh.C102646h;
import ps2.C100894u;
import qo3.C47883u;
import qo3.C89779i0;
import te3.C101756ae0;
import te3.C101789j00;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101804kv2;
import te3.C101833r5;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101850ud0;
import te3.C64719t23;
import te3.sc4;
import te3.tc4;
import te3.w64;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.c */
public class C96014c implements C11184p0, C11385n {

    /* renamed from: d */
    public final String f280405d;

    /* renamed from: e */
    public View f280406e;

    /* renamed from: f */
    public String f280407f;

    /* renamed from: g */
    public TimeLineObject f280408g;

    /* renamed from: h */
    public Activity f280409h;

    /* renamed from: i */
    public int f280410i;

    /* renamed from: j */
    public C94851d1 f280411j;

    /* renamed from: n */
    public C89779i0 f280412n;

    /* renamed from: o */
    public C98963o f280413o;

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.c$a */
    public class C96015a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280414a;

        public C96015a(SnsInfo snsInfo) {
            this.f280414a = snsInfo;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            int i;
            String str2;
            w64 w64;
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$1");
            C96014c cVar = C96014c.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            View view = cVar.f280406e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            C96230u uVar = (C96230u) view.getTag();
            if (uVar == null || (w64 = uVar.f281195e) == null) {
                i = 0;
                str2 = "";
            } else {
                i = w64.f299709j;
                str2 = w64.f299703d;
            }
            SnsReportHelper.f275506m0.mo131353N(this.f280414a, i, str2, 2);
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.listener.c$b */
    public class C96016b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280416a;

        /* renamed from: com.tencent.mm.plugin.sns.ui.listener.c$b$a */
        public class C96017a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C94877g0 f280418d;

            public C96017a(C96016b bVar, C94877g0 g0Var) {
                this.f280418d = g0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2$1");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(this.f280418d);
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2$1");
            }
        }

        public C96016b(SnsInfo snsInfo) {
            this.f280416a = snsInfo;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C94877g0 g0Var;
            int i;
            String str2;
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2");
            String snsId = this.f280416a.getSnsId();
            C96014c cVar = C96014c.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            View view = cVar.f280406e;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            C96230u uVar = (C96230u) view.getTag();
            if (uVar != null) {
                if (C100417r0.m131416e(snsId)) {
                    g0Var = new C94877g0(C100417r0.m131425n(snsId), 6, uVar.f281195e);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(g0Var);
                } else {
                    g0Var = new C94877g0(C100417r0.m131425n(snsId), 4, uVar.f281195e);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(g0Var);
                }
                C96014c cVar2 = C96014c.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                Activity activity = cVar2.f280409h;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                C96014c cVar3 = C96014c.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                Activity activity2 = cVar3.f280409h;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                String string = activity2.getString(C0966R.string.a3h);
                C96014c cVar4 = C96014c.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                Activity activity3 = cVar4.f280409h;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                C89779i0 Q = C76879j.m92723Q(activity, string, activity3.getString(C0966R.string.jbm), true, true, new C96017a(this, g0Var));
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                cVar2.f280412n = Q;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                w64 w64 = uVar.f281195e;
                if (w64 != null) {
                    i = w64.f299709j;
                    str2 = w64.f299703d;
                } else {
                    str2 = "";
                    i = 0;
                }
                SnsReportHelper.f275506m0.mo131353N(this.f280416a, i, str2, 1);
                C99043c cVar5 = C99043c.f290342a;
                C96014c cVar6 = C96014c.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                View view2 = cVar6.f280406e;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                cVar5.mo138385a(view2, 0);
            }
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2");
        }
    }

    public C96014c(Activity activity, int i, C94851d1 d1Var) {
        String str = "MicroMsg.TimeLineMMMenuItemSelectedListener-" + hashCode();
        this.f280405d = str;
        this.f280409h = activity;
        this.f280410i = i;
        this.f280411j = d1Var;
        Log.m105924i(str, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: a */
    public void mo133553a() {
        SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        Log.m105924i(this.f280405d, "addListener");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: b */
    public void mo133554b(View view, String str, TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        this.f280406e = view;
        this.f280407f = str;
        this.f280408g = timeLineObject;
        SnsMethodCalculate.markEndTimeMs("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: c */
    public void mo133555c() {
        boolean z;
        C101789j00 j002;
        C64719t23 t232;
        C101833r5 r5Var;
        SnsMethodCalculate.markStartTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f280407f);
        if (this.f280408g.ContentObj.f298427h.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        C101804kv2 kv22 = this.f280408g.ContentObj.f298427h.get(0);
        if (DN == null || kv22 == null) {
            Log.m105928w(this.f280405d, "favorite music fail, snsinfo or mediaobj is null");
            SnsMethodCalculate.markEndTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        TimeLineObject timeLineObject = this.f280408g;
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (kv22 == null || DN == null || DN.localid == 0) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            String format = String.format("%s#%s", new Object[]{C102236a0.m134765q0(DN.field_snsId), kv22.f298689d});
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", DN.getUserName());
            rd02.mo141275k(DN.getUserName());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            C101835rd0 rd03 = rd02;
            rd03.mo141273f(((long) DN.getCreateTime()) * 1000);
            rd03.mo141274j(DN.getSnsId() + "");
            rd03.mo141278n(format);
            if (!(timeLineObject == null || (r5Var = timeLineObject.AppInfo) == null)) {
                rd03.mo141272d(r5Var.f299236d);
            }
            C101834rc0 rc02 = new C101834rc0();
            rc02.mo141259o(format);
            rc02.mo141240O(kv22.f298692g);
            rc02.mo141241P(kv22.f298699q);
            rc02.mo141242Q(DN.getTimeLine().ContentObj.f298426g);
            if (timeLineObject == null || (t232 = timeLineObject.ContentObj.f298439w) == null || !C86013q1.m106450k(t232.f185472t)) {
                z = false;
            } else {
                rc02.f299286W = timeLineObject.ContentObj.f298439w.f185472t;
                z = true;
            }
            String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22);
            if (C86013q1.m106450k(str)) {
                rc02.f299286W = str;
                z = true;
            }
            if (!z) {
                rc02.mo141232F(true);
                rc02.mo141267w(kv22.f298694i);
                C101756ae0 ae02 = new C101756ae0();
                ae02.mo141197q(kv22.f298694i);
                kd02.mo141221s(ae02);
            }
            rc02.mo141235I(kv22.f298682P);
            rc02.mo141236J(kv22.f298683Q);
            rc02.mo141260p(7);
            rc02.mo141246U(kv22.f298697o);
            rc02.mo141265u(kv22.f298691f);
            rc02.mo141231E(true);
            if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || j002.f298439w == null)) {
                C101841sc0 sc02 = new C101841sc0();
                sc02.f299401C = timeLineObject.ContentObj.f298439w;
                rc02.f299296c1 = sc02;
            }
            kd02.f298618f.add(rc02);
            kd02.mo141219q(rd03);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264676a = kd02;
            aVar.f264678c = 7;
            C97707a.m126009g(rc02, DN);
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = this.f280409h;
        aVar2.f264688m = 25;
        doFavoriteEvent.publish();
        SnsMethodCalculate.markEndTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: d */
    public void mo133556d() {
        String str;
        String str2;
        boolean z;
        C64719t23 t232;
        C101833r5 r5Var;
        SnsMethodCalculate.markStartTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f280407f);
        if (this.f280408g.ContentObj.f298427h.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        C101804kv2 kv22 = this.f280408g.ContentObj.f298427h.get(0);
        if (DN == null || kv22 == null) {
            Log.m105928w(this.f280405d, "favorite music fail, snsinfo or mediaobj is null");
            SnsMethodCalculate.markEndTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        TimeLineObject timeLineObject = this.f280408g;
        C64719t23 t233 = timeLineObject.ContentObj.f298439w;
        SnsMethodCalculate.markStartTimeMs("fillMvEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (kv22 == null || DN == null || DN.localid == 0) {
            str = "favoriteMusicMv";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            SnsMethodCalculate.markEndTimeMs("fillMvEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else if (C94866e1.qy0()) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.coi;
            SnsMethodCalculate.markEndTimeMs("fillMvEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            str = "favoriteMusicMv";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
        } else {
            String format = String.format("%s#%s", new Object[]{C102236a0.m134765q0(DN.field_snsId), kv22.f298689d});
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            str = "favoriteMusicMv";
            Log.m105925i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", DN.getUserName());
            rd02.mo141275k(DN.getUserName());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            rd02.mo141273f(((long) DN.getCreateTime()) * 1000);
            rd02.mo141274j(DN.getSnsId() + "");
            rd02.mo141278n(format);
            if (!(timeLineObject == null || (r5Var = timeLineObject.AppInfo) == null)) {
                rd02.mo141272d(r5Var.f299236d);
            }
            C101834rc0 rc02 = new C101834rc0();
            rc02.mo141259o(format);
            rc02.mo141240O(kv22.f298692g);
            rc02.mo141241P(kv22.f298699q);
            rc02.mo141242Q(DN.getTimeLine().ContentObj.f298426g);
            if (timeLineObject == null || (t232 = timeLineObject.ContentObj.f298439w) == null || !C86013q1.m106450k(t232.f185472t)) {
                z = false;
            } else {
                rc02.f299286W = timeLineObject.ContentObj.f298439w.f185472t;
                z = true;
            }
            String str3 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22);
            if (C86013q1.m106450k(str3)) {
                rc02.f299286W = str3;
                z = true;
            }
            if (!z) {
                rc02.mo141232F(true);
                rc02.mo141267w(kv22.f298694i);
                C101756ae0 ae02 = new C101756ae0();
                ae02.mo141197q(kv22.f298694i);
                kd02.mo141221s(ae02);
            }
            rc02.mo141235I(kv22.f298682P);
            rc02.mo141236J(kv22.f298683Q);
            rc02.mo141260p(29);
            rc02.mo141246U(kv22.f298697o);
            rc02.mo141265u(kv22.f298691f);
            rc02.mo141231E(true);
            if (t233 != null) {
                C101841sc0 sc02 = new C101841sc0();
                sc02.f299401C = t233;
                rc02.f299296c1 = sc02;
            }
            kd02.f298618f.add(rc02);
            kd02.mo141219q(rd02);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264676a = kd02;
            aVar.f264678c = 21;
            C97707a.m126009g(rc02, DN);
            SnsMethodCalculate.markEndTimeMs("fillMvEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = this.f280409h;
        aVar2.f264688m = 25;
        doFavoriteEvent.publish();
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: e */
    public void mo133557e() {
        SnsMethodCalculate.markStartTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f280408g == null) {
            SnsMethodCalculate.markEndTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        TimeLineObject timeLineObject = this.f280408g;
        SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (timeLineObject == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            C101793jd0 jd02 = new C101793jd0();
            rd02.mo141275k(timeLineObject.UserName);
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(2);
            rd02.mo141273f(Util.nowMilliSecond());
            C101833r5 r5Var = timeLineObject.AppInfo;
            if (r5Var != null) {
                rd02.mo141272d(r5Var.f299236d);
            }
            C101789j00 j002 = timeLineObject.ContentObj;
            if (j002 != null) {
                jd02.mo141207o(j002.f298425f);
                jd02.mo141204l(timeLineObject.ContentObj.f298423d);
                LinkedList<C101804kv2> linkedList = timeLineObject.ContentObj.f298427h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    C101804kv2 kv22 = timeLineObject.ContentObj.f298427h.get(0);
                    jd02.mo141208p(kv22.f298704v);
                    jd02.mo141205m(kv22.f298703u);
                    jd02.mo141206n(kv22.f298694i);
                }
            }
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264679d = jd02.f298511d;
            aVar.f264680e = jd02.f298513f;
            aVar.f264676a = kd02;
            aVar.f264678c = 10;
            kd02.mo141219q(rd02);
            kd02.mo141218p(jd02);
            SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = this.f280409h;
        aVar2.f264688m = 26;
        doFavoriteEvent.publish();
        SnsMethodCalculate.markEndTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: f */
    public void mo133558f() {
        SnsMethodCalculate.markStartTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f280408g == null) {
            SnsMethodCalculate.markEndTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        TimeLineObject timeLineObject = this.f280408g;
        SnsMethodCalculate.markStartTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (timeLineObject == null) {
            Log.m105928w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            SnsMethodCalculate.markEndTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            C101850ud0 ud02 = new C101850ud0();
            rd02.mo141275k(timeLineObject.UserName);
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(8);
            rd02.mo141273f(Util.nowMilliSecond());
            C101833r5 r5Var = timeLineObject.AppInfo;
            if (r5Var != null) {
                rd02.mo141272d(r5Var.f299236d);
            }
            C101789j00 j002 = timeLineObject.ContentObj;
            if (j002 != null) {
                ud02.mo141318n(j002.f298425f);
                ud02.mo141315k(timeLineObject.ContentObj.f298423d);
                LinkedList<C101804kv2> linkedList = timeLineObject.ContentObj.f298427h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    C101804kv2 kv22 = timeLineObject.ContentObj.f298427h.get(0);
                    ud02.mo141316l(kv22.f298703u);
                    ud02.mo141317m(kv22.f298694i);
                }
            }
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264679d = ud02.f299618d;
            aVar.f264680e = ud02.f299620f;
            aVar.f264676a = kd02;
            aVar.f264678c = 15;
            kd02.mo141219q(rd02);
            kd02.f298604C = ud02;
            kd02.f298605D = true;
            SnsMethodCalculate.markEndTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264684i = this.f280409h;
        aVar2.f264688m = 27;
        doFavoriteEvent.publish();
        SnsMethodCalculate.markEndTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: g */
    public void mo133559g() {
        String str;
        String str2;
        char c;
        SnsMethodCalculate.markStartTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        Activity activity = this.f280409h;
        TimeLineObject timeLineObject = this.f280408g;
        String l = SnsTimeLineBaseAdapter.m122252l(activity, timeLineObject.ContentObj.f298426g, timeLineObject.AppInfo.f299236d);
        if (Util.isNullOrNil(l)) {
            Log.m105928w(this.f280405d, "favorite url fail, url is null");
            SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        SnsInfo b = C100416r.m131409b(this.f280407f);
        if (b != null) {
            String a = C86493v0.m107223a("" + b.field_snsId);
            C86493v0.C86495c c2 = C86493v0.m107224d().mo120947c(a, true);
            c2.mo120962i("prePublishId", "sns_" + C102236a0.m134765q0(b.field_snsId));
            c2.mo120962i("preUsername", b.field_userName);
            c2.mo120962i("preChatName", "");
            c2.mo120962i("url", l);
            c2.mo120962i("preMsgIndex", 0);
            c2.mo120962i("sendAppMsgScene", 1);
            c2.mo120962i("adExtStr", b.getTimeLine().statExtStr);
            doFavoriteEvent.f264674d.f264683h = a;
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f280407f);
        if (DN != null && this.f280408g.ContentObj.f298424e == 18) {
            C98977w.m128888d(C98977w.C98981d.AdUrl, C98977w.C98980c.Fav, C98977w.C98982e.Samll, 0, DN, this.f280410i);
        }
        if (!Util.isNullOrNil(this.f280408g.canvasInfo)) {
            mo133560h(this.f280409h, DN.getLocalid());
            SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (DN.isAd()) {
            int i = this.f280410i;
            str = "";
            SnsAdClick snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, b.field_snsId, 11, 0);
            C102260r.m134864d(snsAdClick, this.f280413o, DN, 11);
            C102236a0.m134773u0(snsAdClick);
        } else {
            str = "";
        }
        C97707a.m126005c(doFavoriteEvent, l, this.f280407f);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this.f280409h;
        aVar.f264688m = 28;
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            long nowSecond = Util.nowSecond();
            if (!Util.isNullOrNil(l)) {
                Log.m105919d(this.f280405d, "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, l, Long.valueOf(nowSecond), 3, 2, 1);
                try {
                    str2 = URLEncoder.encode(l, "UTF-8");
                    c = 0;
                } catch (UnsupportedEncodingException e) {
                    c = 0;
                    str2 = str;
                    Log.printErrStackTrace(this.f280405d, e, str2, new Object[0]);
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[c] = str2;
                objArr[1] = Long.valueOf(nowSecond);
                objArr[2] = 3;
                objArr[3] = 2;
                objArr[4] = 1;
                nVar.mo160131h(13378, objArr);
            }
        }
        SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: h */
    public void mo133560h(Context context, String str) {
        String str2;
        LinkedList<C101834rc0> linkedList;
        SnsMethodCalculate.markStartTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        if (DN.isAd()) {
            AdSnsInfo adSnsInfo = DN.getAdSnsInfo();
            String a = C100894u.m132221a(DN);
            if (!Util.isNullOrNil(a)) {
                adSnsInfo.field_adxml = a;
            }
            str2 = adSnsInfo.field_adxml;
        } else {
            str2 = timeLine.canvasInfo;
        }
        Map<String, String> parseXml = XmlParser.parseXml(str2, C102646h.COL_ADXML, (String) null);
        if (parseXml == null) {
            SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        } else if (!parseXml.containsKey(".adxml.adCanvasInfo")) {
            C76879j.m92738i(this.f280409h, C0966R.string.coa, 0);
            SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        } else {
            String a2 = C86493v0.m107223a("" + DN.field_snsId);
            String nullAs = Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareTitle"), "");
            String nullAs2 = Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareWebUrl"), "");
            String nullAs3 = Util.nullAs(parseXml.get(".adxml.adCanvasInfo.shareDesc"), "");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            SnsfillEventInfoEvent snsfillEventInfoEvent = new SnsfillEventInfoEvent();
            SnsfillEventInfoEvent.C92600a aVar = snsfillEventInfoEvent.f265220d;
            aVar.f265224c = str;
            aVar.f265225d = doFavoriteEvent;
            aVar.f265222a = nullAs2;
            snsfillEventInfoEvent.publish();
            if (!snsfillEventInfoEvent.f265221e.f265226a) {
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                if (aVar2.f264687l == 0) {
                    aVar2.f264687l = C0966R.string.co9;
                }
                C76879j.m92738i(this.f280409h, aVar2.f264687l, 0);
                SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            }
            DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
            aVar3.f264683h = a2;
            aVar3.f264679d = nullAs;
            aVar3.f264680e = nullAs3;
            C101801kd0 kd02 = aVar3.f264676a;
            if (!(kd02 == null || (linkedList = kd02.f298618f) == null || linkedList.size() <= 0 || kd02.f298618f.get(0) == null)) {
                kd02.f298618f.get(0).mo141252d(str2);
                if (Util.isNullOrNil(kd02.f298618f.get(0).f299297d)) {
                    kd02.f298618f.get(0).mo141246U(doFavoriteEvent.f264674d.f264679d);
                }
                if (Util.isNullOrNil(kd02.f298618f.get(0).f299301f)) {
                    kd02.f298618f.get(0).mo141265u(doFavoriteEvent.f264674d.f264680e);
                }
                C101835rd0 rd02 = new C101835rd0();
                rd02.mo141275k(timeLine.UserName);
                rd02.mo141279o(C75592q0.m90789s());
                rd02.mo141277m(2);
                rd02.mo141273f(Util.nowMilliSecond());
                kd02.mo141219q(rd02);
            }
            DoFavoriteEvent.C92474a aVar4 = doFavoriteEvent.f264674d;
            aVar4.f264684i = this.f280409h;
            aVar4.f264688m = 28;
            doFavoriteEvent.publish();
            SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        }
    }

    /* renamed from: i */
    public void mo133561i(Context context, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null || !DN.isAd()) {
            str2 = null;
        } else {
            str2 = DN.getAdInfoLink();
            if (Util.isNullOrNil(str2)) {
                str2 = DN.getAdLink();
            }
        }
        if (Util.isNullOrNil(str2)) {
            Activity activity = this.f280409h;
            TimeLineObject timeLineObject = this.f280408g;
            str2 = SnsTimeLineBaseAdapter.m122252l(activity, timeLineObject.ContentObj.f298426g, timeLineObject.AppInfo.f299236d);
        }
        String str3 = str2;
        if (Util.isNullOrNil(str3)) {
            Log.m105928w(this.f280405d, "favorite url fail, url is null");
            SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        SnsInfo b = C100416r.m131409b(this.f280407f);
        String str4 = "";
        if (b != null) {
            String a = C86493v0.m107223a(str4 + b.field_snsId);
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            c.mo120962i("prePublishId", "sns_" + C102236a0.m134765q0(b.field_snsId));
            c.mo120962i("preUsername", b.field_userName);
            c.mo120962i("preChatName", str4);
            c.mo120962i("url", str3);
            c.mo120962i("preMsgIndex", 0);
            c.mo120962i("sendAppMsgScene", 1);
            c.mo120962i("adExtStr", b.getTimeLine().statExtStr);
            doFavoriteEvent.f264674d.f264683h = a;
        }
        if (DN != null && (this.f280408g.ContentObj.f298424e == 18 || DN.isAd())) {
            C98977w.m128888d(C98977w.C98981d.AdUrl, C98977w.C98980c.Fav, C98977w.C98982e.Samll, 0, DN, this.f280410i);
            if (this.f280408g != null) {
                int i = this.f280410i;
                SnsAdClick snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, b.field_snsId, 11, 0);
                C102260r.m134864d(snsAdClick, this.f280413o, DN, 11);
                C102236a0.m134773u0(snsAdClick);
            }
        }
        if (!Util.isNullOrNil(this.f280408g.canvasInfo)) {
            mo133560h(this.f280409h, DN.getLocalid());
            SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        C97707a.m126005c(doFavoriteEvent, str3, this.f280407f);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this.f280409h;
        aVar.f264688m = 28;
        doFavoriteEvent.publish();
        if (doFavoriteEvent.f264675e.f9046a == 0) {
            long nowSecond = Util.nowSecond();
            if (!Util.isNullOrNil(str3)) {
                Log.m105919d(this.f280405d, "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, str3, Long.valueOf(nowSecond), 3, 2, 1);
                try {
                    str4 = URLEncoder.encode(str3, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace(this.f280405d, e, str4, new Object[0]);
                }
                C115669n.INSTANCE.mo160131h(13378, str4, Long.valueOf(nowSecond), 3, 2, 1);
            }
        }
        SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: j */
    public void mo133562j(Context context, String str) {
        SnsMethodCalculate.markStartTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (DN.isAd()) {
            C98977w.m128888d(C98977w.C98981d.Sight, C98977w.C98980c.Fav, C98977w.C98982e.Samll, 0, DN, this.f280410i);
            int i = this.f280410i;
            SnsAdClick snsAdClick = new SnsAdClick(i, i == 0 ? 1 : 2, DN.field_snsId, 11, 0);
            C102260r.m134864d(snsAdClick, this.f280413o, DN, 11);
            C102236a0.m134773u0(snsAdClick);
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C97707a.m126006d(doFavoriteEvent, DN);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = this.f280409h;
        aVar.f264688m = 29;
        doFavoriteEvent.publish();
        SnsMethodCalculate.markEndTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: k */
    public void mo133563k(int i, int i2, Intent intent) {
        ADInfo aDInfo;
        int i3 = i;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (i2 == -1) {
            if (i3 == 15) {
                SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f280407f);
                C101804kv2 kv22 = this.f280408g.ContentObj.f298427h.get(0);
                String stringExtra = intent2.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134729X(kv22);
                for (String next : Util.stringsToList(stringExtra.split(","))) {
                    if (DN.isAd()) {
                        String str2 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134725T(kv22);
                        TimeLineObject timeLine = DN.getTimeLine();
                        ADXml adXml = DN.getAdXml();
                        tc4 tc4 = new tc4();
                        tc4.f299538e = kv22.f298668A;
                        tc4.f299537d = kv22.f298706x;
                        if (timeLine.ContentObj.f298424e == 15) {
                            SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            if (this.f280410i == 2) {
                                aDInfo = DN.getAtAdInfo();
                                SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            } else {
                                aDInfo = DN.getAdInfo();
                                SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            }
                            tc4.f299543j = aDInfo.uxInfo;
                            tc4.f299544n = timeLine.f283893Id;
                        } else {
                            sc4 sc4 = timeLine.streamvideo;
                            tc4.f299543j = sc4.f299431j;
                            tc4.f299544n = sc4.f299432n;
                        }
                        tc4.f299541h = timeLine.ContentDesc;
                        tc4.f299542i = Util.isNullOrNil(kv22.f298669B) ? kv22.f298694i : kv22.f298669B;
                        if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
                            tc4.f299540g = adXml.attachShareLinkUrl;
                            tc4.f299539f = adXml.attachShareLinkWording;
                        }
                        int U = C102236a0.m134726U(str2);
                        Log.m105925i(this.f280405d, "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", next, str2, str, kv22.f298706x, Integer.valueOf(kv22.f298668A), Integer.valueOf(U));
                        C7250m.m7431a().mo136262bz(this.f280409h, next, str2, str, 43, U, tc4, false, false, timeLine.statExtStr, (String) null, 0);
                        C7250m.m7431a().mo136252Ar(stringExtra2, next);
                        int i4 = this.f280410i;
                        C102236a0.m134773u0(new SnsAdClick(i4, i4 == 0 ? 1 : 2, DN.field_snsId, 12, 0));
                        boolean U5 = C72996z1.m85820U5(next);
                        C98977w.m128888d(C98977w.C98981d.Sight, U5 ? C98977w.C98980c.Chatroom : C98977w.C98980c.Chat, C98977w.C98982e.Samll, U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(next) : 0, DN, this.f280410i);
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        return;
                    }
                    String str3 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134725T(kv22);
                    int U2 = C102236a0.m134726U(str3);
                    Log.m105925i(this.f280405d, "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", next, str3, str, kv22.f298706x, Integer.valueOf(kv22.f298668A), Integer.valueOf(U2));
                    C7250m.m7431a().Ml0(this.f280409h, next, str3, str, 43, U2, false, false, this.f280408g.statExtStr, (String) null);
                    C7250m.m7431a().mo136252Ar(stringExtra2, next);
                }
                Activity activity = this.f280409h;
                C75026b.m89951a(activity, activity.getString(C0966R.string.fjh));
            }
        } else if (i3 == 15) {
            SnsInfo DN2 = C94866e1.Yx0().mo139798DN(this.f280407f);
            if (DN2 == null) {
                Log.m105929w(this.f280405d, "menuitemselected and snsinfo is null %s", this.f280407f);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            }
            int i5 = this.f280410i;
            C102236a0.m134773u0(new SnsAdClick(i5, i5 == 0 ? 1 : 2, DN2.field_snsId, 13, 0));
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: l */
    public void mo133564l() {
        SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        Log.m105924i(this.f280405d, "removeListener");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* renamed from: m */
    public final String mo133565m() {
        C94965w1.C94967b e;
        SnsMethodCalculate.markStartTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        View view = this.f280406e;
        if (view != null && (view instanceof SnsPostDescPreloadTextView)) {
            SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        } else if (view == null || !(view.getTag() instanceof C96113p5) || !((C96113p5) this.f280406e.getTag()).mo133678b() || (e = C94965w1.m120624e(C94866e1.Yx0().mo139798DN(this.f280407f).getSnsId())) == null) {
            SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        } else {
            String str = e.f275304b;
            SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        if (r42.getItemId() != 29) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        if (r42.getItemId() != 29) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d8, code lost:
        r37 = 7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            jm2.a r1 = jm2.C46562a.INSTANCE
            java.lang.String r2 = "onMMMenuItemSelected"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.view.View r4 = r0.f280406e
            if (r4 != 0) goto L_0x0014
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0014:
            int r4 = r42.getItemId()
            r5 = 28
            java.lang.String r6 = ""
            java.lang.String r7 = "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager"
            r8 = 1929(0x789, float:2.703E-42)
            r9 = 8
            r10 = 11
            r13 = 7
            r14 = 5
            r15 = 2
            r12 = 1
            r11 = 0
            switch(r4) {
                case 0: goto L_0x0c1a;
                case 1: goto L_0x0bda;
                case 2: goto L_0x0b34;
                case 3: goto L_0x0b18;
                case 4: goto L_0x0afc;
                case 5: goto L_0x0ae0;
                case 6: goto L_0x002c;
                case 7: goto L_0x0a6d;
                case 8: goto L_0x0a08;
                case 9: goto L_0x09ec;
                case 10: goto L_0x096b;
                case 11: goto L_0x090b;
                case 12: goto L_0x08b6;
                case 13: goto L_0x08a1;
                case 14: goto L_0x086a;
                case 15: goto L_0x080f;
                case 16: goto L_0x0800;
                case 17: goto L_0x07e9;
                case 18: goto L_0x06f4;
                case 19: goto L_0x049f;
                case 20: goto L_0x041a;
                case 21: goto L_0x03cc;
                case 22: goto L_0x039d;
                case 23: goto L_0x028a;
                case 24: goto L_0x0263;
                case 25: goto L_0x01a0;
                case 26: goto L_0x0117;
                case 27: goto L_0x004a;
                case 28: goto L_0x002e;
                case 29: goto L_0x004a;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0c56
        L_0x002e:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0045
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0045:
            r41.mo133556d()
            goto L_0x0c56
        L_0x004a:
            int r1 = r42.getItemId()
            r4 = 29
            if (r4 != r1) goto L_0x0061
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.sns.ui.u r1 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r1
            if (r1 == 0) goto L_0x005f
            java.lang.String r15 = r1.f281193c
            goto L_0x0065
        L_0x005f:
            r15 = 0
            goto L_0x0065
        L_0x0061:
            java.lang.String r15 = r41.mo133565m()
        L_0x0065:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r1 == 0) goto L_0x006f
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f280408g
            java.lang.String r15 = r1.ContentDesc
        L_0x006f:
            java.lang.Class<vr.e> r1 = p255vr.C65873e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            r5 = 77
            java.lang.String r1 = r1.ep0(r5)
            u73.p0 r6 = new u73.p0
            r6.<init>()
            r6.f39548e = r1
            android.app.Activity r7 = r0.f280409h
            r6.f39544a = r7
            r6.f39547d = r15
            r6.f39545b = r5
            r6.f39549f = r12
            r6.f39551h = r12
            r6.f39552i = r11
            r6.f39560q = r12
            r5 = 2131101833(0x7f060889, float:1.7816087E38)
            int r5 = kg3.C76577a.m92153d(r7, r5)
            r6.f39554k = r5
            r6.f39555l = r11
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.f39550g
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.String r7 = "chatSearch"
            java.lang.String r8 = "1"
            r5.put(r7, r8)
            java.lang.Class<u73.p> r5 = u73.C101982p.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            u73.p r5 = (u73.C101982p) r5
            r5.mo6877X6(r6)
            r31 = 3
            android.app.Activity r5 = r0.f280409h
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI
            if (r6 == 0) goto L_0x00c4
            int r5 = r42.getItemId()
            if (r5 == r4) goto L_0x00d8
            goto L_0x00d5
        L_0x00c4:
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsWsFoldDetailUI
            if (r6 == 0) goto L_0x00cb
            r37 = 6
            goto L_0x00dd
        L_0x00cb:
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            if (r5 == 0) goto L_0x00db
            int r5 = r42.getItemId()
            if (r5 == r4) goto L_0x00d8
        L_0x00d5:
            r37 = 5
            goto L_0x00dd
        L_0x00d8:
            r37 = 7
            goto L_0x00dd
        L_0x00db:
            r37 = 0
        L_0x00dd:
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = os2.C100416r.m131409b(r4)
            java.lang.Class<c00.r> r5 = c00.C92330r.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            r22 = r5
            c00.r r22 = (c00.C92330r) r22
            r23 = 2
            r25 = 77
            r26 = 0
            long r4 = r4.field_snsId
            java.lang.String r29 = vr2.C102236a0.m134765q0(r4)
            r33 = 0
            int r4 = r15.length()
            long r4 = (long) r4
            r35 = r4
            r40 = -1
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            java.lang.String r30 = ""
            java.lang.String r32 = ""
            java.lang.String r38 = ""
            java.lang.String r39 = ""
            r24 = r1
            r22.Hh0(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38, r39, r40)
            goto L_0x0c56
        L_0x0117:
            java.lang.String r1 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = os2.C100416r.m131409b(r1)
            android.view.View r4 = r0.f280406e
            java.lang.Object r4 = r4.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r4 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r4
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r1.getTimeLine()
            int r6 = r4.f281207b
            te3.j00 r7 = r5.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0142
            te3.j00 r5 = r5.ContentObj
            java.util.LinkedList<te3.kv2> r5 = r5.f298427h
            int r4 = r4.f281207b
            java.lang.Object r4 = r5.get(r4)
            te3.kv2 r4 = (te3.C101804kv2) r4
            goto L_0x0147
        L_0x0142:
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
        L_0x0147:
            u73.r r5 = new u73.r
            r5.<init>()
            android.app.Activity r6 = r0.f280409h
            r5.f300283b = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r8 = r4.f298689d
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r7, r8)
            r6.append(r7)
            java.lang.String r7 = vr2.C102236a0.m134717L(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.f300288g = r6
            java.lang.String r6 = r1.field_userName
            r5.f300287f = r6
            android.app.Activity r6 = r0.f280409h
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            if (r7 != 0) goto L_0x0185
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI
            if (r7 == 0) goto L_0x017e
            goto L_0x0185
        L_0x017e:
            boolean r6 = r6 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI
            if (r6 == 0) goto L_0x0189
            r5.f300285d = r13
            goto L_0x0189
        L_0x0185:
            r6 = 10
            r5.f300285d = r6
        L_0x0189:
            r5.f300289h = r4
            long r6 = r1.field_snsId
            java.lang.String r1 = vr2.C102236a0.m134765q0(r6)
            r5.f300286e = r1
            java.lang.Class<u73.n> r1 = u73.C101980n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            u73.n r1 = (u73.C101980n) r1
            r1.mo134683D6(r5)
            goto L_0x0c56
        L_0x01a0:
            java.lang.String r1 = "favoriteVideoCard"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            if (r4 == 0) goto L_0x025e
            te3.j00 r4 = r4.ContentObj
            if (r4 == 0) goto L_0x025e
            int r4 = r4.f298424e
            if (r4 != r5) goto L_0x025e
            com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r4.<init>()
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r7 = "fillEventFinderFeedInfo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.transmit.GetFavDataSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            if (r5 != 0) goto L_0x01d4
            java.lang.String r5 = "MicroMsg.Sns.GetFavDataSource"
            java.lang.String r6 = "fill favorite event fail, tlObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r4.f264674d
            r6 = 2131825658(0x7f1113fa, float:1.9284178E38)
            r5.f264687l = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x0255
        L_0x01d4:
            java.lang.Object[] r9 = new java.lang.Object[r12]
            java.lang.String r10 = r5.f283893Id
            r9[r11] = r10
            java.lang.String r10 = "%s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            te3.kd0 r10 = new te3.kd0
            r10.<init>()
            te3.rd0 r11 = new te3.rd0
            r11.<init>()
            te3.rc0 r12 = new te3.rc0
            r12.<init>()
            java.lang.String r13 = r5.UserName
            r11.mo141275k(r13)
            java.lang.String r13 = eb0.C75592q0.m90789s()
            r11.mo141279o(r13)
            r11.mo141277m(r15)
            int r13 = r5.CreateTime
            long r13 = (long) r13
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r11.mo141273f(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r5.f283893Id
            r13.append(r14)
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            r11.mo141274j(r6)
            r11.mo141278n(r9)
            r12.mo141259o(r9)
            et2.C97707a.m126010h(r12, r5)
            r6 = 20
            r12.mo141260p(r6)
            te3.j00 r9 = r5.ContentObj
            te3.t23 r9 = r9.f298439w
            if (r9 == 0) goto L_0x023d
            te3.sc0 r9 = new te3.sc0
            r9.<init>()
            te3.j00 r13 = r5.ContentObj
            te3.t23 r13 = r13.f298439w
            r9.f299401C = r13
            r12.f299296c1 = r9
        L_0x023d:
            java.util.LinkedList<te3.rc0> r9 = r10.f298618f
            r9.add(r12)
            r10.mo141219q(r11)
            te3.j00 r5 = r5.ContentObj
            te3.rk1 r5 = r5.f298431o
            r10.mo141214l(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r4.f264674d
            r5.f264676a = r10
            r5.f264678c = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x0255:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r4.f264674d
            android.app.Activity r6 = r0.f280409h
            r5.f264684i = r6
            r4.publish()
        L_0x025e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0c56
        L_0x0263:
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f280408g
            if (r1 == 0) goto L_0x0c56
            te3.j00 r1 = r1.ContentObj
            if (r1 == 0) goto L_0x0c56
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.d r1 = (ex0.C45696d) r1
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            te3.j00 r4 = r4.ContentObj
            te3.fa r4 = r4.f298433q
            r1.J90(r4)
            android.app.Activity r1 = r0.f280409h
            r4 = 2131825710(0x7f11142e, float:1.9284284E38)
            java.lang.String r4 = r1.getString(r4)
            nj3.C76879j.m92726T(r1, r4)
            goto L_0x0c56
        L_0x028a:
            java.lang.String r1 = "favoriteAppBrand"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            te3.d05 r4 = r4.weappInfo
            if (r4 != 0) goto L_0x02a1
            java.lang.String r4 = r0.f280405d
            java.lang.String r5 = "favoriteAppBrand weappInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0c56
        L_0x02a1:
            java.lang.Class<kr0.w0> r5 = kr0.C76629w0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kr0.w0 r5 = (kr0.C76629w0) r5
            java.lang.String r6 = r4.f298070d
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r5 = r5.mo106879N2(r6)
            te3.pc0 r6 = new te3.pc0
            r6.<init>()
            java.lang.String r7 = r4.f298070d
            r6.f259741d = r7
            if (r5 == 0) goto L_0x02be
            java.lang.String r7 = r5.field_appId
            r6.f259742e = r7
        L_0x02be:
            java.lang.String r7 = r4.f298071e
            r6.f259746i = r7
            int r7 = r4.f298073g
            r6.f259743f = r7
            int r7 = r4.f298072f
            r6.f259748n = r7
            java.lang.String r7 = r4.f298076j
            r6.f259751q = r7
            int r4 = r4.f298077n
            r6.f259752r = r4
            te3.rc0 r4 = new te3.rc0
            r4.<init>()
            r7 = 19
            r4.mo141260p(r7)
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f280408g
            te3.j00 r8 = r8.ContentObj
            if (r8 == 0) goto L_0x0322
            java.lang.String r9 = r8.f298425f
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            if (r8 == 0) goto L_0x031c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x031c
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r0.f280408g
            te3.j00 r8 = r8.ContentObj
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            java.lang.Object r8 = r8.get(r11)
            te3.kv2 r8 = (te3.C101804kv2) r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r13 = r8.f298689d
            java.lang.String r11 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r11, r13)
            r10.append(r11)
            java.lang.String r8 = vr2.C102236a0.m134729X(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r4.f299284V = r8
            r4.f299286W = r8
            goto L_0x031f
        L_0x031c:
            r4.mo141232F(r12)
        L_0x031f:
            r19 = r9
            goto L_0x0327
        L_0x0322:
            r4.mo141232F(r12)
            r19 = 0
        L_0x0327:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r8 == 0) goto L_0x0345
            if (r5 == 0) goto L_0x033a
            java.lang.String r8 = r5.field_nickname
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x033a
            java.lang.String r5 = r5.field_nickname
            goto L_0x0343
        L_0x033a:
            android.app.Activity r5 = r0.f280409h
            r8 = 2131821750(0x7f1104b6, float:1.9276252E38)
            java.lang.String r5 = r5.getString(r8)
        L_0x0343:
            r19 = r5
        L_0x0345:
            r5 = r19
            r4.mo141246U(r5)
            r4.mo141265u(r5)
            java.lang.String r8 = r4.toString()
            java.lang.String r8 = pb1.C100745t.m131892d(r8, r7)
            r4.mo141257m(r8)
            te3.rd0 r8 = new te3.rd0
            r8.<init>()
            java.lang.String r9 = eb0.C75592q0.m90789s()
            r8.mo141275k(r9)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r8.mo141273f(r9)
            r8.mo141277m(r15)
            te3.kd0 r9 = new te3.kd0
            r9.<init>()
            java.util.LinkedList<te3.rc0> r10 = r9.f298618f
            r10.add(r4)
            r9.f298610I = r6
            r9.f298611J = r12
            r9.mo141219q(r8)
            r9.mo141220r(r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r4.<init>()
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r4.f264674d
            android.app.Activity r8 = r0.f280409h
            r6.f264684i = r8
            r6.f264679d = r5
            r6.f264680e = r5
            r6.f264676a = r9
            r6.f264678c = r7
            r4.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0c56
        L_0x039d:
            java.lang.String r1 = "favoriteNoteLink"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            if (r4 != 0) goto L_0x03b2
            java.lang.String r4 = r0.f280405d
            java.lang.String r5 = "favNotelink,tlobj is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0c56
        L_0x03b2:
            com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r4.<init>()
            java.lang.String r6 = r0.f280407f
            et2.C97707a.m126008f(r4, r6)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r6 = r4.f264674d
            android.app.Activity r7 = r0.f280409h
            r6.f264684i = r7
            r6.f264688m = r5
            r4.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            goto L_0x0c56
        L_0x03cc:
            java.lang.String r1 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = os2.C100416r.m131409b(r1)
            if (r6 != 0) goto L_0x03df
            java.lang.String r1 = r0.f280405d
            java.lang.String r4 = "edit photo fail, info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x03df:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            if (r1 == 0) goto L_0x040f
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            if (r1 != 0) goto L_0x03f2
            goto L_0x040f
        L_0x03f2:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            r7 = r1
            com.tencent.mm.plugin.sns.ui.u4 r7 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r7
            android.app.Activity r4 = r0.f280409h
            android.content.Intent r5 = r42.getIntent()
            int r9 = r0.f280410i
            if (r9 != 0) goto L_0x0407
            r8 = 1
            goto L_0x0408
        L_0x0407:
            r8 = 2
        L_0x0408:
            com.tencent.mm.plugin.sns.model.d1 r10 = r0.f280411j
            com.tencent.p014mm.plugin.sns.p106ui.C96227t4.m123358b(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0c56
        L_0x040f:
            java.lang.String r1 = r0.f280405d
            java.lang.String r4 = "edit photo fail, tag is null or tag is not SnsImageViewTag"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x041a:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0431
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0431:
            java.lang.String r1 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = os2.C100416r.m131409b(r1)
            if (r1 == 0) goto L_0x0489
            boolean r4 = r1.isAd()
            if (r4 == 0) goto L_0x0489
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r1.getAdXml()
            boolean r4 = r4.isLandingPagesAd()
            if (r4 == 0) goto L_0x0489
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139798DN(r5)
            if (r4 == 0) goto L_0x0481
            boolean r4 = r4.isAd()
            if (r4 == 0) goto L_0x0481
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            if (r4 == 0) goto L_0x0481
            com.tencent.mm.modelsns.SnsAdClick r4 = new com.tencent.mm.modelsns.SnsAdClick
            int r5 = r0.f280410i
            if (r5 != 0) goto L_0x0468
            r18 = 1
            goto L_0x046a
        L_0x0468:
            r18 = 2
        L_0x046a:
            long r6 = r1.field_snsId
            r21 = 11
            r22 = 0
            r16 = r4
            r17 = r5
            r19 = r6
            r16.<init>(r17, r18, r19, r21, r22)
            jp2.o r5 = r0.f280413o
            vr2.C102260r.m134864d(r4, r5, r1, r10)
            vr2.C102236a0.m134773u0(r4)
        L_0x0481:
            android.app.Activity r4 = r0.f280409h
            java.lang.String r5 = r0.f280407f
            r0.mo133560h(r4, r5)
            goto L_0x0490
        L_0x0489:
            android.app.Activity r4 = r0.f280409h
            java.lang.String r5 = r0.f280407f
            r0.mo133561i(r4, r5)
        L_0x0490:
            if (r1 == 0) goto L_0x0c56
            boolean r1 = r1.isAd()
            if (r1 == 0) goto L_0x0c56
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r8, r13)
            goto L_0x0c56
        L_0x049f:
            android.app.Activity r1 = r0.f280409h
            java.lang.String r4 = "mutePlayVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r7 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139798DN(r7)
            if (r5 != 0) goto L_0x04c0
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "mute play video but sns info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x04c0:
            boolean r7 = r5.isAd()
            if (r7 == 0) goto L_0x04d3
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "mute play video but it is ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x04d3:
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r5.getTimeLine()
            if (r7 == 0) goto L_0x06e7
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r5.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            if (r7 == 0) goto L_0x06e7
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r5.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
            if (r7 == 0) goto L_0x04f1
            goto L_0x06e7
        L_0x04f1:
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r5.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            java.lang.Object r7 = r7.get(r11)
            te3.kv2 r7 = (te3.C101804kv2) r7
            if (r7 != 0) goto L_0x050e
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "mute paly video but media is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x050e:
            java.lang.String r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r10 = r7.f298689d
            java.lang.String r8 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r8, r10)
            java.lang.String r10 = vr2.C102236a0.m134725T(r7)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r10 == 0) goto L_0x0544
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r10 = vr2.C102236a0.m134729X(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
        L_0x0544:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r13 = vr2.C102236a0.m134735b0(r7)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r10 == 0) goto L_0x0570
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = vr2.C102236a0.m134739d0(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
        L_0x0570:
            int[] r8 = new int[r15]
            android.view.View r10 = r0.f280406e
            if (r10 == 0) goto L_0x0586
            r10.getLocationInWindow(r8)
            android.view.View r10 = r0.f280406e
            int r10 = r10.getWidth()
            android.view.View r13 = r0.f280406e
            int r13 = r13.getHeight()
            goto L_0x0588
        L_0x0586:
            r10 = 0
            r13 = 0
        L_0x0588:
            int r7 = r7.f298690e
            if (r7 != r9) goto L_0x061d
            java.lang.String r1 = r0.f280405d
            java.lang.String r7 = "click to play fake sns video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.app.Activity r7 = r0.f280409h
            java.lang.Class<com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity> r9 = com.tencent.p014mm.plugin.sns.p106ui.fake.SnsFakeVideoActivity.class
            r1.setClass(r7, r9)
            java.lang.String r7 = "intent_video_is_preview"
            r1.putExtra(r7, r11)
            java.lang.String r7 = "intent_video_is_mute_play"
            r1.putExtra(r7, r12)
            java.lang.String r7 = r0.f280407f
            int r7 = os2.C100417r0.m131424m(r7)
            java.lang.String r9 = "intent_video_sns_local_id"
            r1.putExtra(r9, r7)
            int r5 = r5.getCreateTime()
            java.lang.String r7 = "intent_video_sns_create_time"
            r1.putExtra(r7, r5)
            android.view.View r5 = r0.f280406e
            if (r5 == 0) goto L_0x05d9
            r5 = r8[r11]
            java.lang.String r7 = "intent_left"
            r1.putExtra(r7, r5)
            r5 = r8[r12]
            java.lang.String r7 = "intent_top"
            r1.putExtra(r7, r5)
            java.lang.String r5 = "intent_width"
            r1.putExtra(r5, r10)
            java.lang.String r5 = "intent_height"
            r1.putExtra(r5, r13)
        L_0x05d9:
            java.lang.String r5 = "intent_video_thumb_path"
            r1.putExtra(r5, r6)
            android.app.Activity r5 = r0.f280409h
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r1)
            java.lang.Object[] r13 = r6.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener"
            java.lang.String r15 = "mutePlayVideo"
            java.lang.String r16 = "(Landroid/content/Context;)V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r19 = "(Landroid/content/Intent;)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r6.mo10231a(r11)
            android.content.Intent r1 = (android.content.Intent) r1
            r5.startActivity(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener"
            java.lang.String r14 = "mutePlayVideo"
            java.lang.String r15 = "(Landroid/content/Context;)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x061d:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.app.Activity r9 = r0.f280409h
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity> r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.class
            r7.setClass(r9, r15)
            java.lang.String r9 = "intent_thumbpath"
            r7.putExtra(r9, r6)
            java.lang.String r6 = r0.f280407f
            java.lang.String r9 = "intent_localid"
            r7.putExtra(r9, r6)
            int r6 = r0.f280410i
            java.lang.String r9 = "intent_from_scene"
            r7.putExtra(r9, r6)
            java.lang.String r6 = "intent_ismute"
            r7.putExtra(r6, r12)
            pt2.i r6 = pt2.C62497i.f177536a
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r0.f280408g
            te3.k1 r9 = r9.actionInfo
            te3.g1 r9 = r9.f298580j
            java.lang.String r15 = r9.f298271d
            java.lang.String r9 = r9.f298273f
            java.lang.String r6 = r6.mo87530b(r15, r9)
            java.lang.String r9 = "intent_third_sdk_msg"
            r7.putExtra(r9, r6)
            long r5 = r5.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134763p0(r5)
            java.lang.String r6 = "intent_publish_id"
            r7.putExtra(r6, r5)
            android.app.Activity r5 = r0.f280409h
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r5)
            java.lang.String r6 = "intent_bottom_height"
            r7.putExtra(r6, r5)
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            java.lang.String r6 = "sns_video_scene"
            if (r5 == 0) goto L_0x0677
            r7.putExtra(r6, r12)
            goto L_0x0687
        L_0x0677:
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI
            if (r5 == 0) goto L_0x067f
            r7.putExtra(r6, r14)
            goto L_0x0687
        L_0x067f:
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI
            if (r1 == 0) goto L_0x0687
            r1 = 6
            r7.putExtra(r6, r1)
        L_0x0687:
            android.view.View r1 = r0.f280406e
            if (r1 == 0) goto L_0x06a3
            r1 = r8[r11]
            java.lang.String r5 = "img_gallery_left"
            r7.putExtra(r5, r1)
            r1 = r8[r12]
            java.lang.String r5 = "img_gallery_top"
            r7.putExtra(r5, r1)
            java.lang.String r1 = "img_gallery_width"
            r7.putExtra(r1, r10)
            java.lang.String r1 = "img_gallery_height"
            r7.putExtra(r1, r13)
        L_0x06a3:
            android.app.Activity r1 = r0.f280409h
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r7)
            java.lang.Object[] r15 = r5.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener"
            java.lang.String r17 = "mutePlayVideo"
            java.lang.String r18 = "(Landroid/content/Context;)V"
            java.lang.String r19 = "Undefined"
            java.lang.String r20 = "startActivity"
            java.lang.String r21 = "(Landroid/content/Intent;)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r5 = r5.mo10231a(r11)
            android.content.Intent r5 = (android.content.Intent) r5
            r1.startActivity(r5)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener"
            java.lang.String r16 = "mutePlayVideo"
            java.lang.String r17 = "(Landroid/content/Context;)V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "startActivity"
            java.lang.String r20 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.app.Activity r1 = r0.f280409h
            r1.overridePendingTransition(r11, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x06e7:
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "mute play video but media is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x06f4:
            android.app.Activity r1 = r0.f280409h
            java.lang.String r4 = "sendData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r6 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139798DN(r6)
            if (r5 != 0) goto L_0x070d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x070d:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r5.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            int r7 = r7.f298424e
            if (r7 != r12) goto L_0x0771
            android.view.View r7 = r0.f280406e
            java.lang.Object r7 = r7.getTag()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r7 == 0) goto L_0x0730
            android.view.View r7 = r0.f280406e
            java.lang.Object r7 = r7.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r7 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r7
            int r11 = r7.f281207b
        L_0x0730:
            te3.kv2 r5 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120365c(r5, r11)
            if (r5 != 0) goto L_0x0743
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "send photo fail, mediaObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x0743:
            java.lang.String r7 = r5.f298689d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r9, r7)
            r8.append(r9)
            java.lang.String r5 = vr2.C102236a0.m134717L(r5)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.p106ui.FlipView.m121477k(r5, r1)
            java.lang.String r5 = "sns_send_data_ui_image_path"
            r6.putExtra(r5, r1)
            java.lang.String r1 = "sns_send_data_ui_image_media_id"
            r6.putExtra(r1, r7)
            goto L_0x07bc
        L_0x0771:
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            int r1 = r1.f298424e
            r7 = 4
            if (r1 == r7) goto L_0x079f
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            int r1 = r1.f298424e
            r7 = 42
            if (r1 == r7) goto L_0x079f
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            int r1 = r1.f298424e
            r7 = 15
            if (r1 == r7) goto L_0x079f
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            int r1 = r1.f298424e
            r7 = 3
            if (r1 != r7) goto L_0x07bc
        L_0x079f:
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x07dc
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r5.getTimeLine()
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            java.lang.Object r1 = r1.get(r11)
            if (r1 != 0) goto L_0x07bc
            goto L_0x07dc
        L_0x07bc:
            java.lang.String r1 = "exdevice_open_scene_type"
            r6.putExtra(r1, r12)
            java.lang.String r1 = r0.f280407f
            java.lang.String r5 = "sns_local_id"
            r6.putExtra(r5, r1)
            java.lang.String r1 = "sns_send_data_ui_activity"
            r6.putExtra(r1, r12)
            android.app.Activity r1 = r0.f280409h
            java.lang.String r5 = ".ui.chatting.ChattingSendDataToDeviceUI"
            r7 = 0
            ke3.C88144b.m109801s(r1, r5, r6, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x07dc:
            java.lang.String r1 = r0.f280405d
            java.lang.String r5 = "mediaObj is null, send failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0c56
        L_0x07e9:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96230u
            if (r1 == 0) goto L_0x0c56
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.sns.ui.u r1 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r1
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120632m(r1)
            goto L_0x0c56
        L_0x0800:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139798DN(r4)
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120633n(r1)
            goto L_0x0c56
        L_0x080f:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96230u
            if (r1 == 0) goto L_0x0c56
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.view.View r4 = r0.f280406e
            android.content.Context r4 = r4.getContext()
            boolean r1 = r1.checkAvailable(r4)
            if (r1 != 0) goto L_0x0829
            goto L_0x0c56
        L_0x0829:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.sns.ui.u r1 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r1
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r1.f281192b
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139807TE(r5)
            if (r4 == 0) goto L_0x085d
            int r5 = r0.f280410i
            r6 = 715(0x2cb, float:1.002E-42)
            if (r5 != 0) goto L_0x0847
            ad0.C91998s.m115550d(r6)
            goto L_0x084a
        L_0x0847:
            ad0.C91998s.m115549c(r6)
        L_0x084a:
            vr2.C102236a0.m134728W(r4)
            r4.isAd()
            r4.getUxinfo()
            te3.w64 r1 = r1.f281195e
            if (r1 == 0) goto L_0x085d
            int r4 = r1.f299709j
            if (r4 != 0) goto L_0x085d
            long r4 = r1.f299714r
        L_0x085d:
            android.view.View r1 = r0.f280406e
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.sns.ui.u r1 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r1
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120630k(r1)
            goto L_0x0c56
        L_0x086a:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
            android.view.View r4 = r0.f280406e
            android.content.Context r4 = r4.getContext()
            boolean r1 = r1.checkAvailable(r4)
            if (r1 != 0) goto L_0x087a
            goto L_0x0c56
        L_0x087a:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139798DN(r4)
            if (r1 == 0) goto L_0x089c
            int r4 = r0.f280410i
            r5 = 714(0x2ca, float:1.0E-42)
            if (r4 != 0) goto L_0x0890
            ad0.C91998s.m115550d(r5)
            goto L_0x0893
        L_0x0890:
            ad0.C91998s.m115549c(r5)
        L_0x0893:
            vr2.C102236a0.m134728W(r1)
            r1.isAd()
            r1.getUxinfo()
        L_0x089c:
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120631l(r1)
            goto L_0x0c56
        L_0x08a1:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r0.f280407f
            r1.mo139798DN(r4)
            com.tencent.mm.sdk.event.IListener r1 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273611b
            java.lang.String r1 = "dealNotInterest"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
            goto L_0x0c56
        L_0x08b6:
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f280408g
            te3.j00 r1 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            java.lang.Object r1 = r1.get(r11)
            te3.kv2 r1 = (te3.C101804kv2) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r6 = r1.f298689d
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r5, r6)
            r4.append(r5)
            java.lang.String r1 = vr2.C102236a0.m134729X(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "Select_Conv_Type"
            r6 = 3
            r4.putExtra(r5, r6)
            java.lang.String r5 = "select_is_ret"
            r4.putExtra(r5, r12)
            java.lang.String r5 = "mutil_select_is_ret"
            r4.putExtra(r5, r12)
            java.lang.String r5 = "image_path"
            r4.putExtra(r5, r1)
            java.lang.String r1 = "Retr_Msg_Type"
            r4.putExtra(r1, r10)
            android.app.Activity r1 = r0.f280409h
            java.lang.String r5 = ".ui.transmit.SelectConversationUI"
            r6 = 15
            ke3.C88144b.m109802t(r1, r5, r4, r6)
            goto L_0x0c56
        L_0x090b:
            android.view.View r4 = r0.f280406e
            java.lang.Object r4 = r4.getTag()
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96230u
            if (r4 == 0) goto L_0x0c56
            android.view.View r4 = r0.f280406e
            java.lang.Object r4 = r4.getTag()
            com.tencent.mm.plugin.sns.ui.u r4 = (com.tencent.p014mm.plugin.sns.p106ui.C96230u) r4
            java.lang.String r5 = r4.f281193c
            boolean r5 = com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setTextSwallowException(r5)
            if (r5 == 0) goto L_0x095d
            android.app.Activity r5 = r0.f280409h
            r6 = 2131821443(0x7f110383, float:1.927563E38)
            java.lang.String r6 = r5.getString(r6)
            nj3.C76879j.m92726T(r5, r6)
            te3.w64 r5 = r4.f281195e
            if (r5 == 0) goto L_0x0c56
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r0.f280408g
            java.lang.String r6 = r6.f283893Id
            r5.append(r6)
            java.lang.String r6 = ":"
            r5.append(r6)
            te3.w64 r6 = r4.f281195e
            int r6 = r6.f299709j
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r4.f281193c
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getUTF8ByteLength(r4)
            r6 = 4
            r1.F80(r6, r5, r4)
            goto L_0x0c56
        L_0x095d:
            android.app.Activity r1 = r0.f280409h
            r4 = 2131821442(0x7f110382, float:1.9275627E38)
            java.lang.String r4 = r1.getString(r4)
            nj3.C76879j.m92726T(r1, r4)
            goto L_0x0c56
        L_0x096b:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0982
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0982:
            java.lang.String r1 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = os2.C100416r.m131409b(r1)
            if (r1 == 0) goto L_0x09d6
            boolean r4 = r1.isAd()
            if (r4 == 0) goto L_0x09d6
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r1.getAdXml()
            boolean r4 = r4.isLandingPagesAd()
            if (r4 == 0) goto L_0x09d6
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139798DN(r5)
            if (r4 == 0) goto L_0x09ce
            boolean r4 = r4.isAd()
            if (r4 == 0) goto L_0x09ce
            com.tencent.mm.modelsns.SnsAdClick r4 = new com.tencent.mm.modelsns.SnsAdClick
            int r5 = r0.f280410i
            if (r5 != 0) goto L_0x09b5
            r18 = 1
            goto L_0x09b7
        L_0x09b5:
            r18 = 2
        L_0x09b7:
            long r6 = r1.field_snsId
            r21 = 11
            r22 = 0
            r16 = r4
            r17 = r5
            r19 = r6
            r16.<init>(r17, r18, r19, r21, r22)
            jp2.o r5 = r0.f280413o
            vr2.C102260r.m134864d(r4, r5, r1, r10)
            vr2.C102236a0.m134773u0(r4)
        L_0x09ce:
            android.app.Activity r4 = r0.f280409h
            java.lang.String r5 = r0.f280407f
            r0.mo133560h(r4, r5)
            goto L_0x09dd
        L_0x09d6:
            android.app.Activity r4 = r0.f280409h
            java.lang.String r5 = r0.f280407f
            r0.mo133562j(r4, r5)
        L_0x09dd:
            if (r1 == 0) goto L_0x0c56
            boolean r1 = r1.isAd()
            if (r1 == 0) goto L_0x0c56
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r8, r9)
            goto L_0x0c56
        L_0x09ec:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0a03
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0a03:
            r41.mo133558f()
            goto L_0x0c56
        L_0x0a08:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139798DN(r4)
            if (r1 == 0) goto L_0x0c56
            com.tencent.mm.sdk.event.IListener r4 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273611b
            java.lang.String r4 = "setNotInterestABTestSnsSvrId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            long r5 = r1.field_snsId
            java.lang.String r7 = "sns_permission_snsinfo_svr_id"
            r4.putExtra(r7, r5)
            java.lang.String r1 = r1.getUserName()
            java.lang.String r5 = "sns_permission_userName"
            r4.putExtra(r5, r1)
            java.lang.String r1 = "sns_permission_anim"
            r4.putExtra(r1, r12)
            android.app.Activity r1 = r0.f280409h
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsPermissionUI> r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsPermissionUI.class
            r4.setClass(r1, r5)
            android.app.Activity r11 = r0.f280409h
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r5)
            r1.mo10233c(r4)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener"
            java.lang.String r14 = "onMMMenuItemSelected"
            java.lang.String r15 = "(Landroid/view/MenuItem;I)V"
            java.lang.String r16 = "android/app/Activity"
            java.lang.String r17 = "startActivityForResult"
            java.lang.String r18 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0c56
        L_0x0a6d:
            os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139798DN(r4)
            if (r1 != 0) goto L_0x0a84
            java.lang.String r1 = r0.f280405d
            java.lang.String r4 = "delete comment fail!!! snsInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0a84:
            qo3.q r4 = new qo3.q
            android.app.Activity r5 = r0.f280409h
            r4.<init>(r5)
            android.app.Activity r5 = r0.f280409h
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131836870(0x7f113fc6, float:1.930692E38)
            java.lang.String r5 = r5.getString(r6)
            r4.mo107595g(r5)
            android.app.Activity r5 = r0.f280409h
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131821450(0x7f11038a, float:1.9275644E38)
            java.lang.String r5 = r5.getString(r6)
            r4.mo107602n(r5)
            android.app.Activity r5 = r0.f280409h
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r5 = r5.getColor(r6)
            r4.mo107599k(r5)
            com.tencent.mm.plugin.sns.ui.listener.c$b r5 = new com.tencent.mm.plugin.sns.ui.listener.c$b
            r5.<init>(r1)
            r4.mo107600l(r5)
            android.app.Activity r5 = r0.f280409h
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r5 = r5.getString(r6)
            r4.mo107598j(r5)
            com.tencent.mm.plugin.sns.ui.listener.c$a r5 = new com.tencent.mm.plugin.sns.ui.listener.c$a
            r5.<init>(r1)
            r4.mo107597i(r5)
            r4.mo107603o()
            goto L_0x0c56
        L_0x0ae0:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0af7
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0af7:
            r41.mo133557e()
            goto L_0x0c56
        L_0x0afc:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0b13
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0b13:
            r41.mo133555c()
            goto L_0x0c56
        L_0x0b18:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0b2f
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0b2f:
            r41.mo133559g()
            goto L_0x0c56
        L_0x0b34:
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            boolean r1 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r1)
            if (r1 == 0) goto L_0x0b4b
            com.tencent.mm.plugin.sns.model.d1 r1 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r1 = r1.mo130970a()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            r1.mo131337x(r4, r5)
        L_0x0b4b:
            com.tencent.mm.autogen.events.DoFavoriteEvent r1 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r1.<init>()
            java.lang.String r4 = r0.f280407f
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = os2.C100416r.m131409b(r4)
            boolean r5 = r4.isAd()
            if (r5 == 0) goto L_0x0b6e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r4.getAdXml()
            boolean r5 = r5.isLandingPagesAd()
            if (r5 == 0) goto L_0x0b6e
            android.app.Activity r1 = r0.f280409h
            java.lang.String r5 = r0.f280407f
            r0.mo133560h(r1, r5)
            goto L_0x0bab
        L_0x0b6e:
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            int r5 = r5.showFlag
            r6 = 31
            if (r5 != r12) goto L_0x0b87
            java.lang.String r5 = r0.f280407f
            et2.C97707a.m126004b(r1, r5, r11)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d
            android.app.Activity r7 = r0.f280409h
            r5.f264684i = r7
            r5.f264688m = r6
            r1.publish()
            goto L_0x0bab
        L_0x0b87:
            android.view.View r5 = r0.f280406e
            java.lang.Object r5 = r5.getTag()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            if (r5 == 0) goto L_0x0bab
            android.view.View r5 = r0.f280406e
            java.lang.Object r5 = r5.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r5 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r5
            java.lang.String r7 = r0.f280407f
            int r5 = r5.f281207b
            et2.C97707a.m126004b(r1, r7, r5)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r1.f264674d
            android.app.Activity r7 = r0.f280409h
            r5.f264684i = r7
            r5.f264688m = r6
            r1.publish()
        L_0x0bab:
            boolean r1 = r4.isAd()
            if (r1 == 0) goto L_0x0c56
            com.tencent.mm.modelsns.SnsAdClick r1 = new com.tencent.mm.modelsns.SnsAdClick
            int r5 = r0.f280410i
            if (r5 != 0) goto L_0x0bba
            r18 = 1
            goto L_0x0bbc
        L_0x0bba:
            r18 = 2
        L_0x0bbc:
            long r6 = r4.field_snsId
            r21 = 11
            r22 = 0
            r16 = r1
            r17 = r5
            r19 = r6
            r16.<init>(r17, r18, r19, r21, r22)
            jp2.o r5 = r0.f280413o
            vr2.C102260r.m134864d(r1, r5, r4, r10)
            vr2.C102236a0.m134773u0(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r8, r9)
            goto L_0x0c56
        L_0x0bda:
            java.lang.String r1 = r41.mo133565m()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x0be8
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.f280408g
            java.lang.String r1 = r1.ContentDesc
        L_0x0be8:
            com.tencent.mm.plugin.sns.model.d1 r4 = r0.f280411j
            boolean r4 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r4)
            if (r4 == 0) goto L_0x0bff
            com.tencent.mm.plugin.sns.model.d1 r4 = r0.f280411j
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r4 = r4.mo130970a()
            java.lang.String r5 = r0.f280407f
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r0.f280408g
            java.lang.String r6 = r6.f283893Id
            r4.mo131337x(r5, r6)
        L_0x0bff:
            com.tencent.mm.autogen.events.DoFavoriteEvent r4 = new com.tencent.mm.autogen.events.DoFavoriteEvent
            r4.<init>()
            java.lang.String r5 = r0.f280407f
            et2.C97707a.m126007e(r4, r5, r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r4.f264674d
            android.app.Activity r5 = r0.f280409h
            r1.f264684i = r5
            r5 = 30
            r1.f264688m = r5
            r4.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0c1a:
            java.lang.String r4 = r41.mo133565m()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0c28
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r0.f280408g
            java.lang.String r4 = r4.ContentDesc
        L_0x0c28:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setTextSwallowException(r4)
            if (r5 == 0) goto L_0x0c46
            android.app.Activity r5 = r0.f280409h
            r6 = 2131821443(0x7f110383, float:1.927563E38)
            java.lang.String r6 = r5.getString(r6)
            nj3.C76879j.m92726T(r5, r6)
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r0.f280408g
            java.lang.String r5 = r5.f283893Id
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getUTF8ByteLength(r4)
            r1.F80(r15, r5, r4)
            goto L_0x0c52
        L_0x0c46:
            android.app.Activity r1 = r0.f280409h
            r4 = 2131821442(0x7f110382, float:1.9275627E38)
            java.lang.String r4 = r1.getString(r4)
            nj3.C76879j.m92726T(r1, r4)
        L_0x0c52:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0c56:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C96014c.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        long j;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        String str3 = this.f280405d;
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(yVar != null ? yVar.getType() : -1);
        Log.m105925i(str3, "onSceneEnd errType=%d, errCode=%d, sceneType=%d", objArr);
        if (yVar instanceof C94877g0) {
            C89779i0 i0Var = this.f280412n;
            if (i0Var == null) {
                Log.m105924i(this.f280405d, "onSceneEnd: delProgressDialog null");
            } else if (!i0Var.isShowing()) {
                Log.m105924i(this.f280405d, "onSceneEnd: delProgressDialog not showing");
            } else {
                z = true;
            }
            if (z) {
                Log.m105924i(this.f280405d, "delProgressDialog dismiss");
                this.f280412n.dismiss();
                if (i == 0 && i2 == 0) {
                    C94877g0 g0Var = (C94877g0) yVar;
                    if (g0Var.mo131050m1() == 4 || g0Var.mo131050m1() == 6) {
                        Activity activity = this.f280409h;
                        C76912y0.m92769h(activity, activity.getResources().getString(C0966R.string.jj9), C0966R.raw.icons_filled_done);
                        SnsMethodCalculate.markStartTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                        w64 w64 = g0Var.f274936i;
                        if (w64 == null) {
                            SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = "";
                        } else {
                            String str4 = w64.f299703d;
                            SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = str4;
                        }
                        if (!Util.isEqual(str2, C75592q0.m90789s())) {
                            int i3 = g0Var.mo131050m1() == 6 ? 10 : 9;
                            SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            long j2 = g0Var.f274934g;
                            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            C100421x Tx0 = C94866e1.Tx0();
                            SnsMethodCalculate.markStartTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            w64 w642 = g0Var.f274936i;
                            if (w642 == null) {
                                j = 0;
                                SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            } else if (g0Var.f274933f == 6) {
                                j = w642.f299714r;
                                SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            } else {
                                j = (long) w642.f299709j;
                                SnsMethodCalculate.markEndTimeMs("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            }
                            C100420w qq = Tx0.mo139897qq(j2, j, i3);
                            if (qq != null) {
                                qq.mo139887m2();
                                C94866e1.Tx0().update(qq.systemRowid, qq);
                            }
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }
}
