package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct */
public final class EmoticonStoreActionStruct extends C61103a {

    /* renamed from: d */
    public long f265468d;

    /* renamed from: e */
    public int f265469e;

    /* renamed from: f */
    public int f265470f;

    /* renamed from: g */
    public String f265471g = "";

    /* renamed from: h */
    public String f265472h = "";

    /* renamed from: i */
    public String f265473i = "";

    /* renamed from: j */
    public long f265474j;

    /* renamed from: k */
    public long f265475k;

    /* renamed from: l */
    public long f265476l;

    /* renamed from: m */
    public String f265477m = "";

    /* renamed from: n */
    public String f265478n = "";

    /* renamed from: o */
    public String f265479o = "";

    public EmoticonStoreActionStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18662;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265468d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265469e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265470f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265471g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265472h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265473i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265474j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265475k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265476l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265477m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265478n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265479o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265468d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265469e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265470f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265471g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("info");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265472h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265473i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("entrance_scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265474j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265475k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265476l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkReportInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265477m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkIDStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265478n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("linkStatusStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265479o);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public EmoticonStoreActionStruct mo126613s(String str) {
        this.f265473i = mo86045b(FirebaseAnalytics.C113379b.INDEX, str, true);
        return this;
    }

    /* renamed from: t */
    public EmoticonStoreActionStruct mo126614t(String str) {
        this.f265472h = mo86045b("info", str, true);
        return this;
    }

    /* renamed from: u */
    public EmoticonStoreActionStruct mo126615u(String str) {
        this.f265478n = mo86045b("linkIDStr", str, true);
        return this;
    }

    /* renamed from: v */
    public EmoticonStoreActionStruct mo126616v(String str) {
        this.f265477m = mo86045b("linkReportInfo", str, true);
        return this;
    }

    /* renamed from: w */
    public EmoticonStoreActionStruct mo126617w(String str) {
        this.f265479o = mo86045b("linkStatusStr", str, true);
        return this;
    }

    /* renamed from: x */
    public EmoticonStoreActionStruct mo126618x(String str) {
        this.f265471g = mo86045b("pid", str, true);
        return this;
    }

    public EmoticonStoreActionStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 12) {
                String[] strArr = new String[12];
                Arrays.fill(strArr, 0, 12, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265468d = mo86051k(split[0]);
            this.f265469e = Util.getInt(split[1], 0);
            this.f265470f = Util.getInt(split[2], 0);
            mo126618x(split[3]);
            mo126614t(split[4]);
            mo126613s(split[5]);
            this.f265474j = mo86051k(split[6]);
            this.f265475k = mo86051k(split[7]);
            this.f265476l = mo86051k(split[8]);
            mo126616v(split[9]);
            mo126615u(split[10]);
            mo126617w(split[11]);
        }
    }
}
