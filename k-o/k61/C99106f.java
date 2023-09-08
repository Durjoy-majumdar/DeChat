package k61;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* renamed from: k61.f */
public class C99106f {
    /* renamed from: a */
    public static ArrayList<EmojiGroupInfo> m129077a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] parse xml faild. xml is null.");
            return null;
        }
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("Emotion");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                ArrayList<EmojiGroupInfo> arrayList = new ArrayList<>();
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
                    NodeList childNodes = elementsByTagName.item(i).getChildNodes();
                    int length = childNodes.getLength();
                    for (int i2 = 0; i2 < length; i2++) {
                        Node item = childNodes.item(i2);
                        if (item != null && item.getNodeName() != null && item.getNodeName().equals("ProductID")) {
                            String textContent = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] productId:%s", textContent);
                            emojiGroupInfo.field_productID = textContent;
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecType")) {
                            String textContent2 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] RecType:%s", textContent2);
                            emojiGroupInfo.field_recommandType = Integer.valueOf(textContent2).intValue();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecWord")) {
                            String textContent3 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] recWord:%s", textContent3);
                            emojiGroupInfo.field_recommandWord = textContent3;
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Name")) {
                            String textContent4 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] Name:%s", textContent4);
                            emojiGroupInfo.field_packName = textContent4;
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Panel")) {
                            String textContent5 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] iconUrl:%s", textContent5);
                            emojiGroupInfo.field_packGrayIconUrl = textContent5;
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Icon")) {
                            String textContent6 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] BigIconUrl:%s", textContent6);
                            emojiGroupInfo.field_BigIconUrl = textContent6;
                        } else if (!(item == null || item.getNodeName() == null || !item.getNodeName().equals("ButtonType"))) {
                            String textContent7 = item.getTextContent();
                            Log.m105919d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] buttonType:%s", textContent7);
                            emojiGroupInfo.field_buttonType = Integer.valueOf(textContent7).intValue();
                        }
                    }
                    if (!Util.isNullOrNil(emojiGroupInfo.field_productID)) {
                        emojiGroupInfo.field_recommand = 1;
                        emojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
                        emojiGroupInfo.field_sort = 0;
                        C115669n.INSTANCE.mo160131h(12068, 1, emojiGroupInfo.field_productID, Integer.valueOf(emojiGroupInfo.field_recommandType));
                        arrayList.add(emojiGroupInfo);
                    }
                }
                return arrayList;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.EmojiRecommendXMLParser", "[parser] parseXML exception:%s", e.toString());
        }
        return null;
    }
}
