package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct */
public final class MvCreateActionStruct extends C61103a {

    /* renamed from: A */
    public long f156537A;

    /* renamed from: B */
    public long f156538B;

    /* renamed from: C */
    public String f156539C = "";

    /* renamed from: D */
    public long f156540D;

    /* renamed from: E */
    public String f156541E = "";

    /* renamed from: F */
    public int f156542F;

    /* renamed from: G */
    public int f156543G;

    /* renamed from: H */
    public int f156544H;

    /* renamed from: d */
    public String f156545d = "";

    /* renamed from: e */
    public String f156546e = "";

    /* renamed from: f */
    public String f156547f = "";

    /* renamed from: g */
    public String f156548g = "";

    /* renamed from: h */
    public String f156549h = "";

    /* renamed from: i */
    public String f156550i = "";

    /* renamed from: j */
    public String f156551j = "";

    /* renamed from: k */
    public long f156552k;

    /* renamed from: l */
    public long f156553l;

    /* renamed from: m */
    public String f156554m = "";

    /* renamed from: n */
    public String f156555n = "";

    /* renamed from: o */
    public String f156556o = "";

    /* renamed from: p */
    public long f156557p;

    /* renamed from: q */
    public String f156558q = "";

    /* renamed from: r */
    public String f156559r = "";

    /* renamed from: s */
    public String f156560s = "";

    /* renamed from: t */
    public String f156561t = "";

    /* renamed from: u */
    public String f156562u = "";

    /* renamed from: v */
    public long f156563v;

    /* renamed from: w */
    public long f156564w;

    /* renamed from: x */
    public long f156565x;

    /* renamed from: y */
    public long f156566y;

    /* renamed from: z */
    public long f156567z;

    public MvCreateActionStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 22259;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156545d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156546e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156547f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156548g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156549h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156550i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156551j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156552k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156553l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156554m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156555n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156556o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156557p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156558q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156559r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156560s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156561t);
        stringBuffer.append(",");
        stringBuffer.append(this.f156562u);
        stringBuffer.append(",");
        stringBuffer.append(this.f156563v);
        stringBuffer.append(",");
        stringBuffer.append(this.f156564w);
        stringBuffer.append(",");
        stringBuffer.append(this.f156565x);
        stringBuffer.append(",");
        stringBuffer.append(this.f156566y);
        stringBuffer.append(",");
        stringBuffer.append(this.f156567z);
        stringBuffer.append(",");
        stringBuffer.append(this.f156537A);
        stringBuffer.append(",");
        stringBuffer.append(this.f156538B);
        stringBuffer.append(",");
        stringBuffer.append(this.f156539C);
        stringBuffer.append(",");
        stringBuffer.append(this.f156540D);
        stringBuffer.append(",");
        stringBuffer.append(this.f156541E);
        stringBuffer.append(",");
        stringBuffer.append(this.f156542F);
        stringBuffer.append(",");
        stringBuffer.append(this.f156543G);
        stringBuffer.append(",");
        stringBuffer.append(this.f156544H);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156545d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156546e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156547f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156548g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156549h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156550i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156551j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156552k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSave");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156553l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvUserId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156554m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MvObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156555n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156556o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFinderNew");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156557p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PartList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156558q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156559r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156560s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("KeyWord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156561t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExpId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156562u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156563v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PartNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156564w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PartId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156565x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedFrom");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156566y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsEdit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156567z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsNull");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156537A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156538B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156539C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156540D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MaterialCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156541E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Transition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156542F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HideMediaCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156543G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156544H);
        return stringBuffer.toString();
    }

    public MvCreateActionStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 31) {
                String[] strArr = new String[31];
                Arrays.fill(strArr, 0, 31, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f156545d = mo86045b("ContextId", split[0], true);
            this.f156546e = mo86045b("CreateContextId", split[1], true);
            this.f156547f = mo86045b("SongName", split[2], true);
            this.f156548g = mo86045b("SongId", split[3], true);
            this.f156549h = mo86045b("WebUrl", split[4], true);
            this.f156550i = mo86045b("DataUrl", split[5], true);
            this.f156551j = mo86045b("Singer", split[6], true);
            this.f156552k = mo86051k(split[7]);
            this.f156553l = mo86051k(split[8]);
            this.f156554m = mo86045b("MvUserId", split[9], true);
            this.f156555n = mo86045b("MvObjectId", split[10], true);
            this.f156556o = mo86045b("FinderSessionId", split[11], true);
            this.f156557p = mo86051k(split[12]);
            this.f156558q = mo86045b("PartList", split[13], true);
            this.f156559r = mo86045b("FeedId", split[14], true);
            this.f156560s = mo86045b("FinderUin", split[15], true);
            this.f156561t = mo86045b("KeyWord", split[16], true);
            this.f156562u = mo86045b("ExpId", split[17], true);
            this.f156563v = mo86051k(split[18]);
            this.f156564w = mo86051k(split[19]);
            this.f156565x = mo86051k(split[20]);
            this.f156566y = mo86051k(split[21]);
            this.f156567z = mo86051k(split[22]);
            this.f156537A = mo86051k(split[23]);
            this.f156538B = mo86051k(split[24]);
            this.f156539C = mo86045b("RequestId", split[25], true);
            this.f156540D = mo86051k(split[26]);
            this.f156541E = mo86045b("MaterialCount", split[27], true);
            this.f156542F = Util.getInt(split[28], 0);
            this.f156543G = Util.getInt(split[29], 0);
            this.f156544H = Util.getInt(split[30], 0);
        }
    }
}
