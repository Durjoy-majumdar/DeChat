package com.tencent.p014mm.plugin.qqmail.stub;

import ag2.C27900o;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72921o1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C85647p1;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import ef3.C86513a;
import ef3.C86514b;
import f40.C86709a0;
import f62.C75700k0;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import ke3.C88144b;
import lc3.C10485b;
import p237sp.C13754y;
import p823sg.C77710q;
import xf2.C91196d;

/* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy */
public class ReadMailProxy extends C96897a {

    /* renamed from: f */
    public C91196d.C91197a f248728f;

    /* renamed from: g */
    public C91196d.C91197a f248729g;

    /* renamed from: h */
    public C85647p1.C85652e f248730h = new C85363a();

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy$e */
    public class C5026e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f20339d;

        /* renamed from: e */
        public final /* synthetic */ String f20340e;

        public C5026e(ReadMailProxy readMailProxy, long j, String str) {
            this.f20339d = j;
            this.f20340e = str;
        }

        public void run() {
            Class cls = C75700k0.class;
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f20339d);
            String content = b002.getContent();
            b002.mo108732L2(content.replaceFirst("<digest>.*</digest>", "<digest>" + this.f20340e + "</digest>"));
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f20339d, b002);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy$b */
    public class C42783b extends C91196d.C91197a {
        public C42783b() {
        }

        /* renamed from: a */
        public void mo66935a() {
            ReadMailProxy.this.CLIENT_CALL("onComplete", new Object[0]);
        }

        /* renamed from: b */
        public void mo66936b(int i, String str) {
            ReadMailProxy.this.CLIENT_CALL("onError", Integer.valueOf(i), str);
        }

        /* renamed from: c */
        public boolean mo66937c() {
            return ((Boolean) ReadMailProxy.this.CLIENT_CALL("onReady", new Object[0])).booleanValue();
        }

        /* renamed from: d */
        public void mo66938d(String str, Map<String, String> map) {
            ReadMailProxy.this.CLIENT_CALL("onSuccess", str, map);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy$c */
    public class C42784c extends C91196d.C91197a {
        public C42784c() {
        }

        /* renamed from: a */
        public void mo66935a() {
            ReadMailProxy.this.CLIENT_CALL("onComplete", new Object[0]);
        }

        /* renamed from: b */
        public void mo66936b(int i, String str) {
            ReadMailProxy.this.CLIENT_CALL("onError", Integer.valueOf(i), str);
        }

        /* renamed from: c */
        public boolean mo66937c() {
            return ((Boolean) ReadMailProxy.this.CLIENT_CALL("onReady", new Object[0])).booleanValue();
        }

        /* renamed from: d */
        public void mo66938d(String str, Map<String, String> map) {
            ReadMailProxy.this.CLIENT_CALL("onSuccess", str, map);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy$a */
    public class C85363a implements C85647p1.C85652e {
        public C85363a() {
        }

        /* renamed from: a */
        public void mo102882a() {
            ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadFailed", new Object[0]);
        }

        public void onSuccess(int i) {
            ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadSuccess", Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.ReadMailProxy$d */
    public class C85364d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f248732d;

        public C85364d(ReadMailProxy readMailProxy, long j) {
            this.f248732d = j;
        }

        public void run() {
            ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109594b(this.f248732d);
        }
    }

    public ReadMailProxy(C96905d dVar, C91196d.C91197a aVar) {
        super(dVar);
        this.f248728f = aVar;
        this.f248729g = new C42783b();
    }

    @C86514b
    public void cancel(long j) {
        new MMHandler().post(new C85364d(this, j));
    }

    @C86514b
    public void deleteMsgById(long j) {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101125kD(j);
    }

    @C86514b
    public long downloadQQMailApp(String str, String str2) {
        try {
            URL url = new URL(str);
            new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return -1;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", e.toString());
            Log.printErrStackTrace("MicroMsg.ReadMailProxy", e, "", new Object[0]);
            return -1;
        }
    }

    @C86514b
    public long get(String str, Map map, Bundle bundle) {
        C91196d.C91198b bVar = new C91196d.C91198b();
        bVar.f261465a = bundle.getBoolean("qqmail_httpoptions_expired");
        bVar.f261466b = bundle.getBoolean("qqmail_httpoptions_needcache");
        bVar.f261467c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109598g(str, 0, map, (C91196d.C91203g) null, bVar, this.f248729g);
    }

    @C86514b
    public String getBindUin() {
        return new C77710q(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null))).toString();
    }

    @C86514b
    public double getMailAppDownloadProgress(long j) {
        FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(j);
        long j2 = n.f12201n;
        if (j2 <= 0) {
            return 0.0d;
        }
        return (((double) n.f12200j) * 1.0d) / ((double) j2);
    }

    @C86514b
    public Integer getMailAppDownloadStatus(long j) {
        return Integer.valueOf(((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(j).f12196f);
    }

    @C86514b
    public String getMailAppEnterUlAndroid() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
    }

    @C86514b
    public String getMailAppRedirectUrlAndroid() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "MailApp", "MailAppRedirectUrAndroid");
    }

    @C86514b
    public String getMsgContent(long j) {
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j).getContent();
    }

    @C86514b
    public Object getUneradMailCountFromConfig() {
        return C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_QQMAIL_UNREAD_COUNT_INT, -1);
    }

    @C86514b
    public void getUnreadMailCount() {
        C85647p1.C85652e eVar = this.f248730h;
        String str = C85647p1.f249608a;
        ThreadPool.post(new C72921o1(eVar), "QQMailUnreadHelper");
    }

    @C86514b
    public String getUserBindEmail() {
        C86709a0.m107528h();
        return Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null));
    }

    @C86514b
    public boolean isSDCardAvailable() {
        return C86709a0.m107535s().mo121147n();
    }

    @C86513a
    public void onComplete() {
        C91196d.C91197a aVar = this.f248728f;
        if (aVar != null) {
            aVar.mo66935a();
        }
    }

    @C86513a
    public void onError(int i, String str) {
        C91196d.C91197a aVar = this.f248728f;
        if (aVar != null) {
            aVar.mo66936b(i, str);
        }
    }

    @C86513a
    public boolean onReady() {
        C91196d.C91197a aVar = this.f248728f;
        if (aVar == null) {
            return true;
        }
        return aVar.mo66937c();
    }

    @C86513a
    public void onSuccess(String str, Map<String, String> map) {
        C91196d.C91197a aVar = this.f248728f;
        if (aVar != null) {
            aVar.mo66938d(str, map);
        }
    }

    @C86514b
    public long post(String str, Map map, Bundle bundle) {
        C91196d.C91198b bVar = new C91196d.C91198b();
        bVar.f261465a = bundle.getBoolean("qqmail_httpoptions_expired");
        bVar.f261466b = bundle.getBoolean("qqmail_httpoptions_needcache");
        bVar.f261467c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((C27900o) C86312j.m106911c(C27900o.class)).mo55677fI().mo109598g(str, 1, map, (C91196d.C91203g) null, bVar, this.f248729g);
    }

    @C86514b
    public int removeDownloadQQMailAppTask(long j) {
        return ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(j);
    }

    @C86514b
    public void replaceMsgContent(long j, String str) {
        new MMHandler().post(new C5026e(this, j, str));
    }

    @C86514b
    public void reportKvState(int i, int i2) {
        C115669n.INSTANCE.mo160131h(i, Integer.valueOf(i2));
    }

    @C86514b
    public void reportKvStates(int i, int i2, int i3) {
        C115669n.INSTANCE.mo160131h(i, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @C86514b
    public Integer showMailAppRecommend() {
        if (ChannelUtil.channelId == 1) {
            return 0;
        }
        return Integer.valueOf(Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "MailApp", "ShowMailAppRecommend"), 0));
    }

    public ReadMailProxy(C96905d dVar, C91196d.C91197a aVar, ReadMailUI.C42800l lVar) {
        super(dVar);
        this.f248728f = aVar;
        this.f248729g = new C42784c();
    }
}
