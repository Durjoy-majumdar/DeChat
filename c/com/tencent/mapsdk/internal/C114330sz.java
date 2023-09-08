package com.tencent.mapsdk.internal;

import android.content.Context;
import android.net.Uri;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.map.tools.net.exception.NetErrorException;
import com.tencent.map.tools.net.exception.NetUnavailableException;
import com.tencent.mapsdk.vector.VectorMap;

/* renamed from: com.tencent.mapsdk.internal.sz */
public final class C114330sz extends C113932lh {

    /* renamed from: a */
    private Context f342619a;

    /* renamed from: b */
    private C55066lm f342620b = new C55066lm();

    /* renamed from: c */
    private String f342621c = "UNKNOW";

    /* renamed from: d */
    private String f342622d = "";

    /* renamed from: e */
    private VectorMap f342623e;

    /* renamed from: f */
    private C113792gv f342624f;

    public C114330sz(C114337tf tfVar) {
        Context G = tfVar.mo171543G();
        this.f342619a = G;
        this.f342621c = G.getClass().getSimpleName();
        this.f342619a = this.f342619a.getApplicationContext();
        this.f342623e = (VectorMap) tfVar.f339878e_;
        this.f342624f = tfVar.f342647aD.f339861d;
    }

    /* renamed from: a */
    private String m160288a(String str) {
        C113625dh dhVar = (C113625dh) C113601cl.m156511a(C113625dh.class);
        String indoorMapUrl = ((C113609cv) ((C113627dj) C113601cl.m156511a(C113627dj.class)).mo171932h()).getIndoorMapUrl();
        String indoorMapUrl2 = ((C113608cu) dhVar.mo171932h()).getIndoorMapUrl();
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(indoorMapUrl);
        Uri parse3 = Uri.parse(indoorMapUrl2);
        String c = C40002he.m42809c(parse.getAuthority());
        String c2 = C40002he.m42809c(parse.getPath());
        String c3 = C40002he.m42809c(parse2.getPath());
        String c4 = C40002he.m42809c(parse3.getPath());
        if (c.equals(parse2.getAuthority()) && (c2.startsWith(c3) || c2.startsWith(c4))) {
            str = parse3.buildUpon().scheme(dhVar.f340003b ? C113600ck.f339986i : parse.getScheme()).encodedPath(c2.replace(c3, c4)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        C113634dq dqVar = (C113634dq) C113601cl.m156511a(C113634dq.class);
        if (dqVar == null || str.endsWith(".jpg") || str.startsWith(dqVar.mo171959i())) {
            return str;
        }
        return str + this.f342622d + C113798hb.m157069a(this.f342621c);
    }

    /* renamed from: f */
    public final byte[] mo172355f(String str) {
        C113889km.m157545b(C0949kl.f2236f, "download url : ".concat(String.valueOf(str)));
        if (this.f342619a == null || C40002he.m42805a(str) || !this.f342620b.mo76186a(str)) {
            return null;
        }
        if (this.f342623e != null && C40002he.m42805a(this.f342622d) && !C40002he.m42805a(this.f342623e.mo173498x())) {
            this.f342622d = "&eng_ver=" + this.f342623e.mo173498x();
        }
        C113625dh dhVar = (C113625dh) C113601cl.m156511a(C113625dh.class);
        String indoorMapUrl = ((C113609cv) ((C113627dj) C113601cl.m156511a(C113627dj.class)).mo171932h()).getIndoorMapUrl();
        String indoorMapUrl2 = ((C113608cu) dhVar.mo171932h()).getIndoorMapUrl();
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(indoorMapUrl);
        Uri parse3 = Uri.parse(indoorMapUrl2);
        String c = C40002he.m42809c(parse.getAuthority());
        String c2 = C40002he.m42809c(parse.getPath());
        String c3 = C40002he.m42809c(parse2.getPath());
        String c4 = C40002he.m42809c(parse3.getPath());
        if (c.equals(parse2.getAuthority()) && (c2.startsWith(c3) || c2.startsWith(c4))) {
            str = parse3.buildUpon().scheme(dhVar.f340003b ? C113600ck.f339986i : parse.getScheme()).encodedPath(c2.replace(c3, c4)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        C113634dq dqVar = (C113634dq) C113601cl.m156511a(C113634dq.class);
        if (dqVar != null && !str.endsWith(".jpg") && !str.startsWith(dqVar.mo171959i())) {
            str = str + this.f342622d + C113798hb.m157069a(this.f342621c);
        }
        C113889km.m157545b(C0949kl.f2236f, "rectify url : ".concat(String.valueOf(str)));
        try {
            NetResponse doGet = NetManager.getInstance().builder().url(str).userAgent(NetUtil.STR_UserAgent).doGet();
            if (doGet == null) {
                return null;
            }
            if (!str.contains("qt=rtt")) {
                this.f342620b.mo76187b(str);
            }
            return doGet.data;
        } catch (Exception e) {
            if (str.contains("/mvd_map")) {
                int i = -1;
                if (e instanceof NetUnavailableException) {
                    i = ((NetUnavailableException) e).errorCode;
                } else if (e instanceof NetErrorException) {
                    i = ((NetErrorException) e).statusCode;
                }
                this.f342624f.mo172154a().mo172143a(System.currentTimeMillis(), str.substring(str.indexOf(63) + 1), i);
            }
            return null;
        }
    }
}
