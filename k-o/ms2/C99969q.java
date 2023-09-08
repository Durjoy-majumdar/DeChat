package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Map;

/* renamed from: ms2.q */
public class C99969q {

    /* renamed from: ms2.q$a */
    public static class C99970a {

        /* renamed from: a */
        public StringBuffer f292925a = new StringBuffer();

        /* renamed from: a */
        public void mo139308a(String str) {
            SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            if (!Util.isNullOrNil(str)) {
                this.f292925a.append(str);
            }
            SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: b */
        public void mo139309b(String str) {
            SnsMethodCalculate.markStartTimeMs("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            StringBuffer stringBuffer = this.f292925a;
            stringBuffer.append("</" + str + ">");
            SnsMethodCalculate.markEndTimeMs("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: c */
        public String mo139310c() {
            SnsMethodCalculate.markStartTimeMs("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            String stringBuffer = this.f292925a.toString();
            SnsMethodCalculate.markEndTimeMs("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            return stringBuffer;
        }

        /* renamed from: d */
        public void mo139311d(String str) {
            SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            if (Util.isNullOrNil(str)) {
                this.f292925a.append("");
            } else if (str.contains("]]>")) {
                StringBuffer stringBuffer = this.f292925a;
                stringBuffer.append("<![CDATA[" + Util.escapeStringForXml(str) + "]]>");
            } else {
                StringBuffer stringBuffer2 = this.f292925a;
                stringBuffer2.append("<![CDATA[" + str + "]]>");
            }
            SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: e */
        public void mo139312e(String str) {
            SnsMethodCalculate.markStartTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            StringBuffer stringBuffer = this.f292925a;
            stringBuffer.append("<" + str + ">");
            SnsMethodCalculate.markEndTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: f */
        public void mo139313f(String str, Map<String, String> map) {
            SnsMethodCalculate.markStartTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            StringBuffer stringBuffer = this.f292925a;
            stringBuffer.append("<" + str);
            for (String next : map.keySet()) {
                StringBuffer stringBuffer2 = this.f292925a;
                stringBuffer2.append(" " + next + "=\"" + map.get(next) + "\" ");
            }
            this.f292925a.append(">");
            map.clear();
            SnsMethodCalculate.markEndTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: g */
        public void mo139314g(int i) {
            SnsMethodCalculate.markStartTimeMs(MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            this.f292925a.append(i);
            SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            SnsMethodCalculate.markEndTimeMs(MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }

        /* renamed from: h */
        public void mo139315h(String str) {
            SnsMethodCalculate.markStartTimeMs(MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
            mo139311d(str);
            SnsMethodCalculate.markEndTimeMs(MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        }
    }

    /* renamed from: a */
    public static String m130610a(String str) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        SnsMethodCalculate.markStartTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str.matches("\\d*")) {
            z = true;
            SnsMethodCalculate.markEndTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        } else {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isNumeric", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        }
        if (z) {
            SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("filterId", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return "";
    }

    /* renamed from: b */
    public static String m130611b(String str) {
        SnsMethodCalculate.markStartTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("filterNull", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x0d04  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0d96  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0dad  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0dc4  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0e28  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0ed7  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0ee3  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m130612c(com.tencent.p014mm.protocal.protobuf.TimeLineObject r21) {
        /*
            r1 = r21
            java.lang.String r2 = "pullTimeLineXml"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            ms2.q$a r4 = new ms2.q$a
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = "TimelineObject"
            r4.mo139312e(r5)
            java.lang.String r6 = "id"
            r4.mo139312e(r6)
            java.lang.String r7 = r1.f283893Id
            java.lang.String r8 = "0"
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x0042
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = r1.f283893Id
            r7.append(r10)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r4.mo139311d(r7)
            goto L_0x0045
        L_0x0042:
            r4.mo139311d(r8)
        L_0x0045:
            r4.mo139309b(r6)
            java.lang.String r7 = r1.UserName
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = "username"
            r4.mo139312e(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = r1.UserName
            r7.append(r10)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r4.mo139315h(r7)
            java.lang.String r7 = "username"
            r4.mo139309b(r7)
        L_0x006c:
            java.lang.String r7 = "createTime"
            r4.mo139312e(r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r1.CreateTime
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r4.mo139315h(r10)
            r4.mo139309b(r7)
            java.lang.String r7 = "contentDescShowType"
            r4.mo139312e(r7)
            int r10 = r1.contentDescShowType
            r4.mo139314g(r10)
            r4.mo139309b(r7)
            java.lang.String r7 = "contentDescScene"
            r4.mo139312e(r7)
            int r7 = r1.contentDescScene
            r4.mo139314g(r7)
            java.lang.String r7 = "contentDescScene"
            r4.mo139309b(r7)
            java.lang.String r7 = "private"
            r4.mo139312e(r7)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r11 = r1.Privated
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r4.mo139315h(r10)
            r4.mo139309b(r7)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r11 = "version"
            if (r10 == 0) goto L_0x013b
            java.lang.String r10 = r10.f299236d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x013b
            java.lang.String r10 = "appInfo"
            r4.mo139312e(r10)
            r4.mo139312e(r6)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299236d
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            r4.mo139309b(r6)
            r4.mo139312e(r11)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299237e
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            r4.mo139309b(r11)
            java.lang.String r10 = "appName"
            r4.mo139312e(r10)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299238f
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "appName"
            r4.mo139309b(r10)
            java.lang.String r10 = "installUrl"
            r4.mo139312e(r10)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299239g
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "installUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "fromUrl"
            r4.mo139312e(r10)
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299240h
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "fromUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "appInfo"
            r4.mo139309b(r10)
        L_0x013b:
            te3.sc4 r10 = r1.streamvideo
            if (r10 == 0) goto L_0x0207
            java.lang.String r10 = r10.f299425d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0207
            java.lang.String r10 = "streamvideo"
            r4.mo139312e(r10)
            java.lang.String r10 = "streamvideourl"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299425d
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideourl"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideototaltime"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            int r10 = r10.f299426e
            r4.mo139314g(r10)
            java.lang.String r10 = "streamvideototaltime"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideotitle"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299429h
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideotitle"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideowording"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299427f
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideowording"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideoweburl"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299428g
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideoweburl"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideothumburl"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299430i
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideothumburl"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideoaduxinfo"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299431j
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideoaduxinfo"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideopublishid"
            r4.mo139312e(r10)
            te3.sc4 r10 = r1.streamvideo
            java.lang.String r10 = r10.f299432n
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "streamvideopublishid"
            r4.mo139309b(r10)
            java.lang.String r10 = "streamvideo"
            r4.mo139309b(r10)
        L_0x0207:
            te3.w25 r10 = r1.webSearchInfo
            if (r10 == 0) goto L_0x03ee
            java.lang.String r10 = r10.f259899d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x03ee
            java.lang.String r10 = "websearch"
            r4.mo139312e(r10)
            java.lang.String r10 = "relevant_vid"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259899d
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "relevant_vid"
            r4.mo139309b(r10)
            java.lang.String r10 = "relevant_expand"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259900e
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "relevant_expand"
            r4.mo139309b(r10)
            java.lang.String r10 = "relevant_pre_searchid"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259901f
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "relevant_pre_searchid"
            r4.mo139309b(r10)
            java.lang.String r10 = "relevant_shared_openid"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259902g
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "relevant_shared_openid"
            r4.mo139309b(r10)
            java.lang.String r10 = "rec_category"
            r4.mo139312e(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.w25 r12 = r1.webSearchInfo
            long r12 = r12.f259903h
            r10.append(r12)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "rec_category"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareUrl"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259905j
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareTitle"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259906n
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareTitle"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareDesc"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259907o
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareDesc"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareImgUrl"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259908p
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareImgUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareString"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259909q
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareString"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareStringUrl"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259910r
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareStringUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "source"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259911s
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "source"
            r4.mo139309b(r10)
            java.lang.String r10 = "strPlayCount"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259904i
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "strPlayCount"
            r4.mo139309b(r10)
            java.lang.String r10 = "titleUrl"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259913u
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "titleUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "extReqParams"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259914v
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "extReqParams"
            r4.mo139309b(r10)
            java.lang.String r10 = "tagList"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259915w
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "tagList"
            r4.mo139309b(r10)
            java.lang.String r10 = "channelId"
            r4.mo139312e(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.w25 r12 = r1.webSearchInfo
            long r12 = r12.f259916x
            r10.append(r12)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "channelId"
            r4.mo139309b(r10)
            java.lang.String r10 = "thumbUrl"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259917y
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "thumbUrl"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareTag"
            r4.mo139312e(r10)
            te3.w25 r10 = r1.webSearchInfo
            java.lang.String r10 = r10.f259918z
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareTag"
            r4.mo139309b(r10)
            java.lang.String r10 = "websearch"
            r4.mo139309b(r10)
        L_0x03ee:
            java.lang.String r10 = "contentDesc"
            r4.mo139312e(r10)
            java.lang.String r10 = r1.ContentDesc
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "contentDesc"
            r4.mo139309b(r10)
            java.lang.String r10 = "contentattr"
            r4.mo139312e(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r12 = r1.contentattr
            r10.append(r12)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r4.mo139315h(r10)
            java.lang.String r10 = "contentattr"
            r4.mo139309b(r10)
            java.lang.String r10 = "sourceUserName"
            r4.mo139312e(r10)
            java.lang.String r10 = r1.sourceUserName
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "sourceUserName"
            r4.mo139309b(r10)
            java.lang.String r10 = "sourceNickName"
            r4.mo139312e(r10)
            java.lang.String r10 = r1.sourceNickName
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "sourceNickName"
            r4.mo139309b(r10)
            java.lang.String r10 = "statisticsData"
            r4.mo139312e(r10)
            java.lang.String r10 = r1.statisticsData
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "statisticsData"
            r4.mo139309b(r10)
            java.lang.String r10 = "weappInfo"
            r4.mo139312e(r10)
            java.lang.String r10 = "appUserName"
            r4.mo139312e(r10)
            te3.d05 r10 = r1.weappInfo
            java.lang.String r10 = r10.f298070d
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "appUserName"
            r4.mo139309b(r10)
            java.lang.String r10 = "pagePath"
            r4.mo139312e(r10)
            te3.d05 r10 = r1.weappInfo
            java.lang.String r10 = r10.f298071e
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "pagePath"
            r4.mo139309b(r10)
            r4.mo139312e(r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.d05 r12 = r1.weappInfo
            int r12 = r12.f298072f
            r10.append(r12)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            r4.mo139309b(r11)
            java.lang.String r10 = "debugMode"
            r4.mo139312e(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.d05 r11 = r1.weappInfo
            int r11 = r11.f298073g
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "debugMode"
            r4.mo139309b(r10)
            java.lang.String r10 = "shareActionId"
            r4.mo139312e(r10)
            te3.d05 r10 = r1.weappInfo
            java.lang.String r10 = r10.f298074h
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "shareActionId"
            r4.mo139309b(r10)
            java.lang.String r10 = "isGame"
            r4.mo139312e(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.d05 r11 = r1.weappInfo
            int r11 = r11.f298075i
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "isGame"
            r4.mo139309b(r10)
            java.lang.String r10 = "messageExtraData"
            r4.mo139312e(r10)
            te3.d05 r10 = r1.weappInfo
            java.lang.String r10 = r10.f298076j
            java.lang.String r10 = m130611b(r10)
            r4.mo139315h(r10)
            java.lang.String r10 = "messageExtraData"
            r4.mo139309b(r10)
            java.lang.String r10 = "subType"
            r4.mo139312e(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.d05 r12 = r1.weappInfo
            int r12 = r12.f298077n
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = m130611b(r11)
            r4.mo139315h(r11)
            r4.mo139309b(r10)
            java.lang.String r11 = "preloadResources"
            r4.mo139312e(r11)
            te3.d05 r11 = r1.weappInfo
            java.lang.String r11 = r11.f298078o
            java.lang.String r11 = m130611b(r11)
            r4.mo139315h(r11)
            java.lang.String r11 = "preloadResources"
            r4.mo139309b(r11)
            java.lang.String r11 = "weappInfo"
            r4.mo139309b(r11)
            java.lang.String r11 = "canvasInfoXml"
            r4.mo139312e(r11)
            java.lang.String r11 = r1.canvasInfo
            java.lang.String r11 = m130611b(r11)
            r4.mo139315h(r11)
            java.lang.String r11 = "canvasInfoXml"
            r4.mo139309b(r11)
            te3.kr2 r11 = r1.Location
            if (r11 == 0) goto L_0x065e
            float r12 = r11.f298647d
            float r11 = r11.f298648e
            r13 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x065e
            r12 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x065e
            r0.clear()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.kr2 r12 = r1.Location
            float r12 = r12.f298647d
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "longitude"
            r0.put(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.kr2 r12 = r1.Location
            float r12 = r12.f298648e
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "latitude"
            r0.put(r12, r11)
            te3.kr2 r11 = r1.Location
            java.lang.String r11 = r11.f298649f
            java.lang.String r11 = m130611b(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
            java.lang.String r12 = "city"
            r0.put(r12, r11)
            te3.kr2 r11 = r1.Location
            java.lang.String r11 = r11.f298650g
            java.lang.String r11 = m130611b(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
            java.lang.String r12 = "poiName"
            r0.put(r12, r11)
            te3.kr2 r11 = r1.Location
            java.lang.String r11 = r11.f298651h
            java.lang.String r11 = m130611b(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
            java.lang.String r12 = "poiAddress"
            r0.put(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.kr2 r12 = r1.Location
            int r12 = r12.f298655o
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "poiScale"
            r0.put(r12, r11)
            te3.kr2 r11 = r1.Location
            java.lang.String r11 = r11.f298652i
            java.lang.String r11 = m130611b(r11)
            java.lang.String r12 = "poiClassifyId"
            r0.put(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.kr2 r12 = r1.Location
            int r12 = r12.f298653j
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "poiClassifyType"
            r0.put(r12, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.kr2 r12 = r1.Location
            int r12 = r12.f298656p
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "poiClickableStatus"
            r0.put(r12, r11)
            java.lang.String r11 = "location"
            r4.mo139313f(r11, r0)
            java.lang.String r11 = "location"
            r4.mo139309b(r11)
        L_0x065e:
            java.lang.String r11 = "ContentObject"
            r4.mo139312e(r11)
            java.lang.String r11 = "contentStyle"
            r4.mo139312e(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.j00 r12 = r1.ContentObj
            int r12 = r12.f298424e
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r4.mo139315h(r11)
            java.lang.String r11 = "contentStyle"
            r4.mo139309b(r11)
            java.lang.String r11 = "contentSubStyle"
            r4.mo139312e(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            te3.j00 r12 = r1.ContentObj
            int r12 = r12.f298428i
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r4.mo139315h(r11)
            java.lang.String r11 = "contentSubStyle"
            r4.mo139309b(r11)
            java.lang.String r11 = "title"
            r4.mo139312e(r11)
            te3.j00 r12 = r1.ContentObj
            java.lang.String r12 = r12.f298425f
            java.lang.String r12 = m130611b(r12)
            r4.mo139315h(r12)
            r4.mo139309b(r11)
            java.lang.String r12 = "description"
            r4.mo139312e(r12)
            te3.j00 r13 = r1.ContentObj
            java.lang.String r13 = r13.f298423d
            java.lang.String r13 = m130611b(r13)
            r4.mo139315h(r13)
            r4.mo139309b(r12)
            java.lang.String r13 = "contentUrl"
            r4.mo139312e(r13)
            te3.j00 r13 = r1.ContentObj
            java.lang.String r13 = r13.f298426g
            java.lang.String r13 = m130611b(r13)
            r4.mo139315h(r13)
            java.lang.String r13 = "contentUrl"
            r4.mo139309b(r13)
            te3.j00 r13 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            int r13 = r13.size()
            java.lang.String r14 = "height"
            java.lang.String r15 = "width"
            r16 = r2
            if (r13 <= 0) goto L_0x0a05
            java.lang.String r13 = "mediaList"
            r4.mo139312e(r13)
            te3.j00 r13 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r13 = r13.f298427h
            java.util.Iterator r13 = r13.iterator()
        L_0x06fe:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x09ff
            java.lang.Object r17 = r13.next()
            r2 = r17
            te3.kv2 r2 = (te3.C101804kv2) r2
            r17 = r13
            java.lang.String r13 = "media"
            r4.mo139312e(r13)
            r4.mo139312e(r6)
            java.lang.String r13 = r2.f298689d
            java.lang.String r13 = m130610a(r13)
            boolean r13 = r13.equals(r9)
            if (r13 == 0) goto L_0x0727
            r4.mo139315h(r8)
            goto L_0x0730
        L_0x0727:
            java.lang.String r13 = r2.f298689d
            java.lang.String r13 = m130610a(r13)
            r4.mo139315h(r13)
        L_0x0730:
            r4.mo139309b(r6)
            java.lang.String r13 = "type"
            r4.mo139312e(r13)
            r18 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r19 = r8
            int r8 = r2.f298690e
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.mo139315h(r6)
            r4.mo139309b(r13)
            r4.mo139312e(r11)
            java.lang.String r6 = r2.f298697o
            java.lang.String r6 = m130611b(r6)
            r4.mo139315h(r6)
            r4.mo139309b(r11)
            r4.mo139312e(r12)
            java.lang.String r6 = r2.f298691f
            java.lang.String r6 = m130611b(r6)
            r4.mo139315h(r6)
            r4.mo139309b(r12)
            r4.mo139312e(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r2.f298696n
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.mo139315h(r6)
            r4.mo139309b(r7)
            java.lang.String r6 = r2.f298682P
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x07a5
            java.lang.String r6 = "songalbumurl"
            r4.mo139312e(r6)
            java.lang.String r6 = r2.f298682P
            r4.mo139315h(r6)
            java.lang.String r6 = "songalbumurl"
            r4.mo139309b(r6)
        L_0x07a5:
            java.lang.String r6 = r2.f298683Q
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x07be
            java.lang.String r6 = "songlyric"
            r4.mo139312e(r6)
            java.lang.String r6 = r2.f298683Q
            r4.mo139315h(r6)
            java.lang.String r6 = "songlyric"
            r4.mo139309b(r6)
        L_0x07be:
            r0.clear()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r2.f298693h
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r13, r6)
            java.lang.String r6 = r2.f298705w
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            java.lang.String r8 = "md5"
            if (r6 != 0) goto L_0x07f7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r20 = r7
            java.lang.String r7 = r2.f298705w
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r8, r6)
            goto L_0x07f9
        L_0x07f7:
            r20 = r7
        L_0x07f9:
            java.lang.String r6 = r2.f298680M
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0818
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.f298680M
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "videomd5"
            r0.put(r7, r6)
        L_0x0818:
            java.lang.String r6 = "url"
            r4.mo139313f(r6, r0)
            java.lang.String r6 = r2.f298692g
            java.lang.String r6 = m130611b(r6)
            r4.mo139315h(r6)
            java.lang.String r6 = "url"
            r4.mo139309b(r6)
            java.lang.String r6 = r2.f298694i
            if (r6 == 0) goto L_0x0863
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0863
            r0.clear()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r2.f298695j
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r13, r6)
            java.lang.String r6 = "thumb"
            r4.mo139313f(r6, r0)
            java.lang.String r6 = r2.f298694i
            java.lang.String r6 = m130611b(r6)
            r4.mo139315h(r6)
            java.lang.String r6 = "thumb"
            r4.mo139309b(r6)
        L_0x0863:
            java.lang.String r6 = "videoDuration"
            r4.mo139312e(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            float r7 = r2.f298684R
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.mo139315h(r6)
            java.lang.String r6 = "videoDuration"
            r4.mo139309b(r6)
            int r6 = r2.f298704v
            if (r6 <= 0) goto L_0x08a1
            r4.mo139312e(r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r2.f298704v
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.mo139315h(r6)
            r4.mo139309b(r10)
        L_0x08a1:
            java.lang.String r6 = r2.f298703u
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x08c9
            java.lang.String r6 = "userData"
            r4.mo139312e(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.f298703u
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.mo139315h(r6)
            java.lang.String r6 = "userData"
            r4.mo139309b(r6)
        L_0x08c9:
            java.lang.String r6 = r2.f298699q
            if (r6 == 0) goto L_0x08ff
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x08ff
            r0.clear()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r2.f298700r
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r13, r6)
            java.lang.String r6 = "lowBandUrl"
            r4.mo139313f(r6, r0)
            java.lang.String r6 = r2.f298699q
            java.lang.String r6 = m130611b(r6)
            r4.mo139315h(r6)
            java.lang.String r6 = "lowBandUrl"
            r4.mo139309b(r6)
        L_0x08ff:
            te3.mv2 r6 = r2.f298698p
            if (r6 == 0) goto L_0x0970
            r0.clear()
            te3.mv2 r6 = r2.f298698p
            float r6 = r6.f298875d
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0925
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            te3.mv2 r13 = r2.f298698p
            float r13 = r13.f298875d
            r6.append(r13)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r15, r6)
        L_0x0925:
            te3.mv2 r6 = r2.f298698p
            float r6 = r6.f298876e
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0943
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            te3.mv2 r13 = r2.f298698p
            float r13 = r13.f298876e
            r6.append(r13)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.put(r14, r6)
        L_0x0943:
            te3.mv2 r6 = r2.f298698p
            float r6 = r6.f298877f
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0964
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            te3.mv2 r7 = r2.f298698p
            float r7 = r7.f298877f
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "totalSize"
            r0.put(r7, r6)
        L_0x0964:
            java.lang.String r6 = "size"
            r4.mo139313f(r6, r0)
            java.lang.String r6 = "size"
            r4.mo139309b(r6)
        L_0x0970:
            java.util.LinkedList<te3.b84> r6 = r2.f298688V
            if (r6 == 0) goto L_0x09c6
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x09c6
            java.lang.String r6 = "EmotionList"
            r4.mo139312e(r6)
            r6 = 0
        L_0x0980:
            java.util.LinkedList<te3.b84> r7 = r2.f298688V
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x09c1
            java.lang.String r7 = "emotion"
            r4.mo139312e(r7)
            java.lang.String r7 = "wording"
            r4.mo139312e(r7)
            java.util.LinkedList<te3.b84> r7 = r2.f298688V
            java.lang.Object r7 = r7.get(r6)
            te3.b84 r7 = (te3.b84) r7
            java.lang.String r7 = r7.f182230e
            r4.mo139311d(r7)
            java.lang.String r7 = "wording"
            r4.mo139309b(r7)
            r4.mo139312e(r8)
            java.util.LinkedList<te3.b84> r7 = r2.f298688V
            java.lang.Object r7 = r7.get(r6)
            te3.b84 r7 = (te3.b84) r7
            java.lang.String r7 = r7.f182229d
            r4.mo139311d(r7)
            r4.mo139309b(r8)
            java.lang.String r7 = "emotion"
            r4.mo139309b(r7)
            int r6 = r6 + 1
            goto L_0x0980
        L_0x09c1:
            java.lang.String r2 = "EmotionList"
            r4.mo139309b(r2)
        L_0x09c6:
            boolean r2 = r1.isExcerpt
            if (r2 == 0) goto L_0x09ef
            java.lang.String r2 = "BizInfo"
            r4.mo139312e(r2)
            java.lang.String r2 = "ExcerptUrl"
            r4.mo139312e(r2)
            java.lang.String r2 = r1.snsExcerptUrl
            java.lang.String r2 = java.net.URLEncoder.encode(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r2)
            java.lang.String r2 = m130611b(r2)
            r4.mo139315h(r2)
            java.lang.String r2 = "ExcerptUrl"
            r4.mo139309b(r2)
            java.lang.String r2 = "BizInfo"
            r4.mo139309b(r2)
        L_0x09ef:
            java.lang.String r2 = "media"
            r4.mo139309b(r2)
            r13 = r17
            r6 = r18
            r8 = r19
            r7 = r20
            goto L_0x06fe
        L_0x09ff:
            java.lang.String r0 = "mediaList"
            r4.mo139309b(r0)
        L_0x0a05:
            java.lang.StringBuffer r0 = r4.f292925a
            te3.j00 r2 = r1.ContentObj
            java.lang.String r2 = r2.f298429j
            java.lang.String r2 = m130611b(r2)
            r0.append(r2)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            java.lang.String r2 = "duration"
            if (r0 == 0) goto L_0x0b0e
            int r0 = r0.f299443d
            r6 = -1
            if (r0 == r6) goto L_0x0b0e
            java.lang.String r0 = "mmreadershare"
            r4.mo139312e(r0)
            java.lang.String r0 = "itemshowtype"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299443d
            r4.mo139314g(r0)
            java.lang.String r0 = "itemshowtype"
            r4.mo139309b(r0)
            java.lang.String r0 = "ispaysubscribe"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299453q
            r4.mo139314g(r0)
            java.lang.String r0 = "ispaysubscribe"
            r4.mo139309b(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299443d
            r6 = 5
            if (r0 == r6) goto L_0x0a5c
            r6 = 16
            if (r0 != r6) goto L_0x0b08
        L_0x0a5c:
            java.lang.String r0 = "pubtime"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299448i
            r4.mo139314g(r0)
            java.lang.String r0 = "pubtime"
            r4.mo139309b(r0)
            java.lang.String r0 = "vid"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            java.lang.String r0 = r0.f299450n
            r4.mo139315h(r0)
            java.lang.String r0 = "vid"
            r4.mo139309b(r0)
            java.lang.String r0 = "funcflag"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299451o
            r4.mo139314g(r0)
            java.lang.String r0 = "funcflag"
            r4.mo139309b(r0)
            r4.mo139312e(r2)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299449j
            r4.mo139314g(r0)
            r4.mo139309b(r2)
            java.lang.String r0 = "digest"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            java.lang.String r0 = r0.f299445f
            r4.mo139315h(r0)
            java.lang.String r0 = "digest"
            r4.mo139309b(r0)
            java.lang.String r0 = "cover"
            r4.mo139312e(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            java.lang.String r0 = r0.f299452p
            r4.mo139315h(r0)
            java.lang.String r0 = "cover"
            r4.mo139309b(r0)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            java.lang.String r0 = r0.f299450n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0aea
            java.lang.String r0 = "nativepage"
            r4.mo139312e(r0)
            r0 = 1
            r4.mo139314g(r0)
            java.lang.String r0 = "nativepage"
            r4.mo139309b(r0)
        L_0x0aea:
            r4.mo139312e(r15)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299446g
            r4.mo139314g(r0)
            r4.mo139309b(r15)
            r4.mo139312e(r14)
            te3.j00 r0 = r1.ContentObj
            te3.st2 r0 = r0.f298430n
            int r0 = r0.f299447h
            r4.mo139314g(r0)
            r4.mo139309b(r14)
        L_0x0b08:
            java.lang.String r0 = "mmreadershare"
            r4.mo139309b(r0)
        L_0x0b0e:
            te3.j00 r0 = r1.ContentObj
            te3.rk1 r0 = r0.f298431o
            if (r0 == 0) goto L_0x0b24
            te3.rk1 r0 = new te3.rk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.rk1 r0 = r0.f298431o
            java.lang.String r0 = ht1.C60167f1.m70147e(r0)
            r4.mo139308a(r0)
        L_0x0b24:
            te3.j00 r0 = r1.ContentObj
            te3.t23 r0 = r0.f298439w
            if (r0 == 0) goto L_0x0b3a
            te3.t23 r0 = new te3.t23
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.t23 r0 = r0.f298439w
            java.lang.String r0 = ht1.C98521u5.m127973a(r0)
            r4.mo139308a(r0)
        L_0x0b3a:
            te3.j00 r0 = r1.ContentObj
            te3.fw2 r0 = r0.f298436t
            if (r0 == 0) goto L_0x0b50
            te3.fw2 r0 = new te3.fw2
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.fw2 r0 = r0.f298436t
            java.lang.String r0 = ht1.C60167f1.m70150h(r0)
            r4.mo139308a(r0)
        L_0x0b50:
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298432p
            if (r0 == 0) goto L_0x0b66
            te3.tk1 r0 = new te3.tk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298432p
            java.lang.String r0 = ht1.C60167f1.m70149g(r0)
            r4.mo139308a(r0)
        L_0x0b66:
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298438v
            if (r0 == 0) goto L_0x0b90
            te3.tk1 r0 = new te3.tk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298438v
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            ht1.u4 r6 = r6.mo76885uf()
            int r6 = r6.mo8924c()
            java.lang.String r0 = ht1.C60167f1.m70149g(r0)
            java.lang.String r0 = ht1.C60167f1.m70143a(r6, r0)
            r4.mo139308a(r0)
        L_0x0b90:
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298442z
            if (r0 == 0) goto L_0x0bab
            te3.tk1 r0 = new te3.tk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.tk1 r0 = r0.f298442z
            java.lang.String r0 = ht1.C60167f1.m70149g(r0)
            r6 = 4
            java.lang.String r0 = ht1.C60167f1.m70143a(r6, r0)
            r4.mo139308a(r0)
        L_0x0bab:
            te3.j00 r0 = r1.ContentObj
            te3.fa r0 = r0.f298433q
            if (r0 == 0) goto L_0x0bc3
            ad0.p r0 = new ad0.p
            r0.<init>()
            te3.j00 r6 = r1.ContentObj
            te3.fa r6 = r6.f298433q
            r0.f263357a = r6
            java.lang.String r0 = r0.mo74685b()
            r4.mo139308a(r0)
        L_0x0bc3:
            te3.j00 r0 = r1.ContentObj
            te3.p81 r0 = r0.f298435s
            if (r0 == 0) goto L_0x0c00
            te3.p81 r0 = new te3.p81
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.p81 r0 = r0.f298435s
            java.lang.String r6 = "setShareLive"
            java.lang.String r7 = "com.tencent.mm.modelsns.SnsFinderShareLive"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.lang.String r8 = "<set-?>"
            gy3.C87412m.m108594g(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            java.lang.String r6 = "makeContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.lang.String r8 = "getShareLive"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            java.lang.String r0 = ht1.C60167f1.m70145c(r0)
            java.lang.String r8 = "makeContent(shareLive)"
            gy3.C87412m.m108593f(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r4.mo139308a(r0)
        L_0x0c00:
            te3.j00 r0 = r1.ContentObj
            te3.nk1 r0 = r0.f298434r
            if (r0 == 0) goto L_0x0c16
            te3.nk1 r0 = new te3.nk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.nk1 r0 = r0.f298434r
            java.lang.String r0 = ht1.C60167f1.m70146d(r0)
            r4.mo139308a(r0)
        L_0x0c16:
            te3.j00 r0 = r1.ContentObj
            te3.sk1 r0 = r0.f298440x
            if (r0 == 0) goto L_0x0c31
            te3.sk1 r0 = new te3.sk1
            r0.<init>()
            te3.j00 r0 = r1.ContentObj
            te3.sk1 r0 = r0.f298440x
            java.lang.String r0 = ht1.C60167f1.m70148f(r0)
            r6 = 2
            java.lang.String r0 = ht1.C60167f1.m70143a(r6, r0)
            r4.mo139308a(r0)
        L_0x0c31:
            te3.j00 r0 = r1.ContentObj
            te3.gm3 r0 = r0.f298422A
            if (r0 == 0) goto L_0x0c56
            java.lang.String r6 = "Rabbit2023"
            r4.mo139312e(r6)
            te3.p81 r6 = r0.f183351d
            if (r6 == 0) goto L_0x0c51
            ad0.j r6 = new ad0.j
            r6.<init>()
            te3.p81 r0 = r0.f183351d
            r6.mo74689f(r0)
            java.lang.String r0 = r6.mo74687d()
            r4.mo139308a(r0)
        L_0x0c51:
            java.lang.String r0 = "Rabbit2023"
            r4.mo139309b(r0)
        L_0x0c56:
            java.lang.String r0 = "ContentObject"
            r4.mo139309b(r0)
            te3.k1 r0 = r1.actionInfo
            if (r0 == 0) goto L_0x0cb8
            java.lang.String r0 = "actionInfo"
            r4.mo139312e(r0)
            te3.k1 r0 = r1.actionInfo
            te3.g1 r0 = r0.f298580j
            if (r0 == 0) goto L_0x0cb3
            java.lang.String r0 = "appMsg"
            r4.mo139312e(r0)
            java.lang.String r0 = "mediaTagName"
            r4.mo139312e(r0)
            te3.k1 r0 = r1.actionInfo
            te3.g1 r0 = r0.f298580j
            java.lang.String r0 = r0.f298272e
            r4.mo139311d(r0)
            java.lang.String r0 = "mediaTagName"
            r4.mo139309b(r0)
            java.lang.String r0 = "messageExt"
            r4.mo139312e(r0)
            te3.k1 r0 = r1.actionInfo
            te3.g1 r0 = r0.f298580j
            java.lang.String r0 = r0.f298273f
            r4.mo139311d(r0)
            java.lang.String r0 = "messageExt"
            r4.mo139309b(r0)
            java.lang.String r0 = "messageAction"
            r4.mo139312e(r0)
            te3.k1 r0 = r1.actionInfo
            te3.g1 r0 = r0.f298580j
            java.lang.String r0 = r0.f298274g
            r4.mo139311d(r0)
            java.lang.String r0 = "messageAction"
            r4.mo139309b(r0)
            java.lang.String r0 = "appMsg"
            r4.mo139309b(r0)
        L_0x0cb3:
            java.lang.String r0 = "actionInfo"
            r4.mo139309b(r0)
        L_0x0cb8:
            te3.r5 r0 = r1.AppInfo
            java.lang.String r6 = "MicroMsg.TimelineConvert"
            if (r0 == 0) goto L_0x0d00
            java.lang.String r0 = r0.f299236d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0d00
            java.lang.String r7 = r1.statExtStr
            te3.bb4 r0 = new te3.bb4
            r0.<init>()
            if (r7 == 0) goto L_0x0cd7
            r8 = 0
            byte[] r10 = android.util.Base64.decode(r7, r8)
            r0.parseFrom(r10)     // Catch:{ Exception -> 0x0cd7 }
        L_0x0cd7:
            te3.za4 r8 = new te3.za4
            r8.<init>()
            r0.f226994f = r8
            te3.r5 r10 = r1.AppInfo
            java.lang.String r10 = r10.f299236d
            r8.f186651d = r10
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0cf6 }
            r8 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ IOException -> 0x0cf4 }
            java.lang.String r0 = "\n"
            java.lang.String r0 = r7.replace(r0, r9)     // Catch:{ IOException -> 0x0cf6 }
            goto L_0x0cfe
        L_0x0cf4:
            r0 = move-exception
            goto L_0x0cf8
        L_0x0cf6:
            r0 = move-exception
            r8 = 0
        L_0x0cf8:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r8)
            r0 = r7
        L_0x0cfe:
            r1.statExtStr = r0
        L_0x0d00:
            java.lang.String r0 = r1.statExtStr
            if (r0 == 0) goto L_0x0d24
            java.lang.String r0 = "statExtStr"
            r4.mo139312e(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r1.statExtStr
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r4.mo139315h(r0)
            java.lang.String r0 = "statExtStr"
            r4.mo139309b(r0)
        L_0x0d24:
            te3.jo2 r0 = r1.liteappInfo
            if (r0 == 0) goto L_0x0d7f
            java.lang.String r0 = r0.f298552d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0d7f
            java.lang.String r0 = "liteApp"
            r4.mo139312e(r0)
            java.lang.String r0 = "appId"
            r4.mo139312e(r0)
            te3.jo2 r0 = r1.liteappInfo
            java.lang.String r0 = r0.f298552d
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "appId"
            r4.mo139309b(r0)
            java.lang.String r0 = "path"
            r4.mo139312e(r0)
            te3.jo2 r0 = r1.liteappInfo
            java.lang.String r0 = r0.f298553e
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "path"
            r4.mo139309b(r0)
            java.lang.String r0 = "query"
            r4.mo139312e(r0)
            te3.jo2 r0 = r1.liteappInfo
            java.lang.String r0 = r0.f298554f
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "query"
            r4.mo139309b(r0)
            java.lang.String r0 = "liteApp"
            r4.mo139309b(r0)
        L_0x0d7f:
            te3.e94 r0 = r1.videoTemplate
            if (r0 == 0) goto L_0x0e24
            java.lang.String r0 = r0.f182943e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0e24
            java.lang.String r0 = "VideoTemplate"
            r4.mo139312e(r0)
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182942d
            if (r0 == 0) goto L_0x0da7
            java.lang.String r0 = "Type"
            r4.mo139312e(r0)
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182942d
            r4.mo139315h(r0)
            java.lang.String r0 = "Type"
            r4.mo139309b(r0)
        L_0x0da7:
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182943e
            if (r0 == 0) goto L_0x0dbe
            java.lang.String r0 = "TemplateId"
            r4.mo139312e(r0)
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182943e
            r4.mo139315h(r0)
            java.lang.String r0 = "TemplateId"
            r4.mo139309b(r0)
        L_0x0dbe:
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182944f
            if (r0 == 0) goto L_0x0dd5
            java.lang.String r0 = "MusicId"
            r4.mo139312e(r0)
            te3.e94 r0 = r1.videoTemplate
            java.lang.String r0 = r0.f182944f
            r4.mo139315h(r0)
            java.lang.String r0 = "MusicId"
            r4.mo139309b(r0)
        L_0x0dd5:
            java.lang.String r0 = "VersionInfo"
            r4.mo139312e(r0)
            java.lang.String r0 = "IosSdkVersionMin"
            r4.mo139312e(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            te3.e94 r7 = r1.videoTemplate
            long r7 = r7.f182946h
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r4.mo139315h(r0)
            java.lang.String r0 = "IosSdkVersionMin"
            r4.mo139309b(r0)
            java.lang.String r0 = "AndroidSdkVersionMin"
            r4.mo139312e(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            te3.e94 r7 = r1.videoTemplate
            long r7 = r7.f182945g
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r4.mo139315h(r0)
            java.lang.String r0 = "AndroidSdkVersionMin"
            r4.mo139309b(r0)
            java.lang.String r0 = "VersionInfo"
            r4.mo139309b(r0)
            java.lang.String r0 = "VideoTemplate"
            r4.mo139309b(r0)
        L_0x0e24:
            te3.ms1 r0 = r1.gameShareCardObject
            if (r0 == 0) goto L_0x0eb4
            java.lang.String r0 = "gameshare"
            r4.mo139312e(r0)
            java.lang.String r0 = "liteappext"
            r4.mo139312e(r0)
            java.lang.String r0 = "liteappbizdata"
            r4.mo139312e(r0)
            te3.ms1 r0 = r1.gameShareCardObject
            java.lang.String r0 = r0.f298871h
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "liteappbizdata"
            r4.mo139309b(r0)
            java.lang.String r0 = "liteapppriority"
            r4.mo139312e(r0)
            te3.ms1 r0 = r1.gameShareCardObject
            int r0 = r0.f298872i
            r4.mo139314g(r0)
            java.lang.String r0 = "liteapppriority"
            r4.mo139309b(r0)
            java.lang.String r0 = "liteappext"
            r4.mo139309b(r0)
            java.lang.String r0 = "gameshareid"
            r4.mo139312e(r0)
            te3.ms1 r0 = r1.gameShareCardObject
            java.lang.String r0 = r0.f298868e
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "gameshareid"
            r4.mo139309b(r0)
            java.lang.String r0 = "sharedata"
            r4.mo139312e(r0)
            te3.ms1 r0 = r1.gameShareCardObject
            java.lang.String r0 = r0.f298867d
            java.lang.String r0 = m130611b(r0)
            r4.mo139315h(r0)
            java.lang.String r0 = "sharedata"
            r4.mo139309b(r0)
            java.lang.String r0 = "isvideo"
            r4.mo139312e(r0)
            te3.ms1 r0 = r1.gameShareCardObject
            int r0 = r0.f298869f
            r4.mo139314g(r0)
            java.lang.String r0 = "isvideo"
            r4.mo139309b(r0)
            r4.mo139312e(r2)
            te3.ms1 r0 = r1.gameShareCardObject
            int r0 = r0.f298870g
            r4.mo139314g(r0)
            r4.mo139309b(r2)
            java.lang.String r0 = "gameshare"
            r4.mo139309b(r0)
        L_0x0eb4:
            r4.mo139309b(r5)
            java.lang.String r0 = r4.mo139310c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "xmlContent: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            r1 = 0
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r5, r1)
            if (r1 != 0) goto L_0x0ee3
            java.lang.String r0 = "xml is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return r9
        L_0x0ee3:
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms2.C99969q.m130612c(com.tencent.mm.protocal.protobuf.TimeLineObject):java.lang.String");
    }
}
