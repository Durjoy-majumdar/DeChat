package jw0;

import com.tencent.wechat.p326mm.biz.BizCgiCardProto;
import com.tencent.wechat.p326mm.biz.BizCgiProto;
import com.tencent.wechat.p326mm.biz.BizProto;
import gy3.C87412m;

/* renamed from: jw0.b */
public final class C21289b {
    /* renamed from: a */
    public static final BizCgiCardProto.BizRecommendExptMsg m23807a(BizProto.BizMsgInfo bizMsgInfo) {
        BizCgiProto.ViewMsgCard viewMsgCard;
        BizCgiProto.CanvasRecCardInfo canvasRecCardInfo;
        BizCgiCardProto.BizRecommendExptXml cardInfo;
        C87412m.m108594g(bizMsgInfo, "<this>");
        BizProto.BizMsgItemContent content = bizMsgInfo.getContent();
        if (content == null || (viewMsgCard = content.getViewMsgCard()) == null || (canvasRecCardInfo = viewMsgCard.getCanvasRecCardInfo()) == null || (cardInfo = canvasRecCardInfo.getCardInfo()) == null) {
            return null;
        }
        return cardInfo.getBizRecommendExpt();
    }

    /* renamed from: b */
    public static final int m23808b(BizProto.BizMsgInfo bizMsgInfo) {
        int style;
        C87412m.m108594g(bizMsgInfo, "<this>");
        if (!m23812f(bizMsgInfo)) {
            if (m23813g(bizMsgInfo)) {
                BizCgiCardProto.BizRecommendArticle c = m23809c(bizMsgInfo);
                if (!(c == null || (style = c.getStyle()) == 0 || style == 3 || style == 5)) {
                    switch (style) {
                        case 101:
                        case 102:
                        case 104:
                        case 105:
                            return 3;
                        case 103:
                            return 7;
                    }
                }
                return 1;
            } else if (m23811e(bizMsgInfo)) {
                return 5;
            } else {
                if (m23810d(bizMsgInfo)) {
                    return 4;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static final BizCgiCardProto.BizRecommendArticle m23809c(BizProto.BizMsgInfo bizMsgInfo) {
        BizCgiProto.ViewMsgCard viewMsgCard;
        BizCgiProto.NativeRecCardInfo nativeRecCardInfo;
        BizCgiCardProto.BizRecommendArticleXml cardInfo;
        C87412m.m108594g(bizMsgInfo, "<this>");
        BizProto.BizMsgItemContent content = bizMsgInfo.getContent();
        if (content == null || (viewMsgCard = content.getViewMsgCard()) == null || (nativeRecCardInfo = viewMsgCard.getNativeRecCardInfo()) == null || (cardInfo = nativeRecCardInfo.getCardInfo()) == null) {
            return null;
        }
        return cardInfo.getBizAccountRecommend();
    }

    /* renamed from: d */
    public static final boolean m23810d(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "<this>");
        return bizMsgInfo.getMsgViewType() == 4;
    }

    /* renamed from: e */
    public static final boolean m23811e(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "<this>");
        return bizMsgInfo.getMsgViewType() == 3;
    }

    /* renamed from: f */
    public static final boolean m23812f(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "<this>");
        return bizMsgInfo.getMsgViewType() == 0;
    }

    /* renamed from: g */
    public static final boolean m23813g(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "<this>");
        return bizMsgInfo.getMsgViewType() == 2;
    }

    /* renamed from: h */
    public static final boolean m23814h(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "<this>");
        return m23813g(bizMsgInfo) || m23810d(bizMsgInfo);
    }
}
