package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.tencent.mm.modelsimple.c */
public class C68138c {
    /* renamed from: a */
    public BindWordingContent mo93650a(String str) {
        String text;
        String str2 = "";
        BindWordingContent bindWordingContent = new BindWordingContent(str2, str2);
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new StringReader(str));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                str2 = newPullParser.getName();
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                String trim = text.trim();
                if (str2.equalsIgnoreCase(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    bindWordingContent.f195809d = trim;
                } else if (str2.equalsIgnoreCase(MimeTypes.BASE_TYPE_TEXT)) {
                    bindWordingContent.f195810e = trim;
                } else if (str2.equalsIgnoreCase("type")) {
                    try {
                        bindWordingContent.f195811f = Integer.valueOf(trim);
                    } catch (Exception unused) {
                        bindWordingContent.f195811f = 0;
                    }
                }
            }
        }
        return bindWordingContent;
    }
}
