package com.tencent.midas.api.ability;

import android.os.Bundle;

public class MidasActivityAbility extends MidasBaseAbility {
    private static final String BUNDLE_PREFIX = "__midas_ability_activity__";
    public String action;
    public String area;
    public String partition;
    public String payItem;
    public String platId;
    public String roleId;
    public String roleName;
    public String sceneInfo;
    public AbsShare shareInfo;

    public static abstract class AbsQQShare extends AbsShare {
        public String arkJson = "";
        public boolean hideQzone = false;

        public void fromBundle(Bundle bundle) {
            Class<AbsQQShare> cls = AbsQQShare.class;
            super.fromBundle(bundle);
            this.hideQzone = bundle.getBoolean(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_hideQzone");
            this.arkJson = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_arkJson");
        }

        public Bundle toBundle() {
            Class<AbsQQShare> cls = AbsQQShare.class;
            Bundle bundle = super.toBundle();
            bundle.putBoolean(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_hideQzone", this.hideQzone);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_arkJson", this.arkJson);
            return bundle;
        }

        public String toString() {
            return super.toString() + "|hideQzone=" + this.hideQzone + "|arkJson=" + this.arkJson;
        }
    }

    public static abstract class AbsShare implements IMidasAbility {
        public static final String TYPE_KEY = "shareType";
        public static final int TYPE_QQ_MINIPROGRAM = 2;
        public static final int TYPE_QQ_WEB = 1;
        public static final int TYPE_WX_MINIPROGRAM = 4;
        public static final int TYPE_WX_WEB = 3;

        public static AbsShare createChild(Bundle bundle) {
            int i = bundle.getInt("__midas_ability_activity__shareType");
            if (i == 1) {
                QQWebShare qQWebShare = new QQWebShare();
                qQWebShare.fromBundle(bundle);
                return qQWebShare;
            } else if (i == 2) {
                QQMiniProgramShare qQMiniProgramShare = new QQMiniProgramShare();
                qQMiniProgramShare.fromBundle(bundle);
                return qQMiniProgramShare;
            } else if (i == 3) {
                WXWebShare wXWebShare = new WXWebShare();
                wXWebShare.fromBundle(bundle);
                return wXWebShare;
            } else if (i != 4) {
                return null;
            } else {
                WXMiniProgramShare wXMiniProgramShare = new WXMiniProgramShare();
                wXMiniProgramShare.fromBundle(bundle);
                return wXMiniProgramShare;
            }
        }

        public void fromBundle(Bundle bundle) {
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt("__midas_ability_activity__shareType", type());
            return bundle;
        }

        public String toString() {
            return "shareType=" + type();
        }

        public abstract int type();
    }

    public static abstract class AbsWXShare extends AbsShare {
        public String description = "";
        public int scene = 0;
        public byte[] thumbData = null;
        public String title = "";
        public String transaction = "";
        public String userOpenId = "";

        public void fromBundle(Bundle bundle) {
            Class<AbsWXShare> cls = AbsWXShare.class;
            super.fromBundle(bundle);
            this.title = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title");
            this.description = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_description");
            this.thumbData = bundle.getByteArray(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_thumbData");
            this.scene = bundle.getInt(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_scene");
            this.transaction = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_transaction");
            this.userOpenId = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_userOpenId");
        }

        public Bundle toBundle() {
            Class<AbsWXShare> cls = AbsWXShare.class;
            Bundle bundle = super.toBundle();
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title", this.title);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_description", this.description);
            bundle.putByteArray(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_thumbData", this.thumbData);
            bundle.putInt(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_scene", this.scene);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_transaction", this.transaction);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_userOpenId", this.userOpenId);
            return bundle;
        }

        public String toString() {
            return super.toString() + "|title=" + this.title + "|description=" + this.description + "|thumbData=" + this.thumbData + "|scene=" + this.scene + "|transaction=" + this.transaction + "|userOpenId=" + this.userOpenId;
        }
    }

    public static class QQMiniProgramShare extends AbsQQShare {
        public String imageUrl;
        public String miniProgramType;
        public String summary;
        public String title;

        public void fromBundle(Bundle bundle) {
            Class<QQMiniProgramShare> cls = QQMiniProgramShare.class;
            super.fromBundle(bundle);
            this.title = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title");
            this.summary = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_summary");
            this.imageUrl = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_imageUrl");
            this.miniProgramType = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_miniProgramType");
        }

        public Bundle toBundle() {
            Class<QQMiniProgramShare> cls = QQMiniProgramShare.class;
            Bundle bundle = super.toBundle();
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title", this.title);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_summary", this.summary);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_imageUrl", this.imageUrl);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_miniProgramType", this.miniProgramType);
            return bundle;
        }

        public String toString() {
            return super.toString() + "|title=" + this.title + "|summary=" + this.summary + "|imageUrl=" + this.imageUrl + "|miniProgramType=" + this.miniProgramType;
        }

        public int type() {
            return 2;
        }
    }

    public static class QQWebShare extends AbsQQShare {
        public String appName;
        public String imageUrl;
        public String summary;
        public String title;

        public void fromBundle(Bundle bundle) {
            Class<QQWebShare> cls = QQWebShare.class;
            super.fromBundle(bundle);
            this.title = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title");
            this.summary = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_summary");
            this.imageUrl = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_imageUrl");
            this.appName = bundle.getString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_appName");
        }

        public Bundle toBundle() {
            Class<QQWebShare> cls = QQWebShare.class;
            Bundle bundle = super.toBundle();
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_title", this.title);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_summary", this.summary);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_imageUrl", this.imageUrl);
            bundle.putString(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_appName", this.appName);
            return bundle;
        }

        public String toString() {
            return super.toString() + "|title=" + this.title + "|summary=" + this.summary + "|imageUrl=" + this.imageUrl + "|appName=" + this.appName;
        }

        public int type() {
            return 1;
        }
    }

    public static class WXMiniProgramShare extends AbsWXShare {
        public int miniprogramType;
        public boolean withShareTicket;

        public void fromBundle(Bundle bundle) {
            Class<WXMiniProgramShare> cls = WXMiniProgramShare.class;
            super.fromBundle(bundle);
            this.withShareTicket = bundle.getBoolean(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_withShareTicket");
            this.miniprogramType = bundle.getInt(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_miniprogramType");
        }

        public Bundle toBundle() {
            Class<WXMiniProgramShare> cls = WXMiniProgramShare.class;
            Bundle bundle = super.toBundle();
            bundle.putBoolean(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_withShareTicket", this.withShareTicket);
            bundle.putInt(MidasActivityAbility.BUNDLE_PREFIX + cls.getSimpleName() + "_miniprogramType", this.miniprogramType);
            return bundle;
        }

        public String toString() {
            return super.toString() + "|withShareTicket=" + this.withShareTicket + "|miniprogramType=" + this.miniprogramType;
        }

        public int type() {
            return 4;
        }
    }

    public static class WXWebShare extends AbsWXShare {
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        public Bundle toBundle() {
            return super.toBundle();
        }

        public String toString() {
            return super.toString();
        }

        public int type() {
            return 3;
        }
    }

    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.payItem = bundle.getString("__midas_ability_activity__payItem");
        this.area = bundle.getString("__midas_ability_activity__area");
        this.platId = bundle.getString("__midas_ability_activity__platId");
        this.partition = bundle.getString("__midas_ability_activity__partition");
        this.roleId = bundle.getString("__midas_ability_activity__roleId");
        this.roleName = bundle.getString("__midas_ability_activity__roleName");
        this.action = bundle.getString("__midas_ability_activity__action");
        this.sceneInfo = bundle.getString("__midas_ability_activity__sceneInfo");
        Bundle bundle2 = bundle.getBundle("__midas_ability_activity__shareInfo");
        if (bundle2 != null) {
            this.shareInfo = AbsShare.createChild(bundle2);
        }
    }

    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putString("__midas_ability_activity__payItem", this.payItem);
        bundle.putString("__midas_ability_activity__area", this.area);
        bundle.putString("__midas_ability_activity__platId", this.platId);
        bundle.putString("__midas_ability_activity__partition", this.partition);
        bundle.putString("__midas_ability_activity__roleId", this.roleId);
        bundle.putString("__midas_ability_activity__roleName", this.roleName);
        bundle.putString("__midas_ability_activity__action", this.action);
        bundle.putString("__midas_ability_activity__sceneInfo", this.sceneInfo);
        AbsShare absShare = this.shareInfo;
        if (absShare != null) {
            bundle.putBundle("__midas_ability_activity__shareInfo", absShare.toBundle());
        }
        return bundle;
    }

    public String toString() {
        return super.toString() + "|payItem=" + this.payItem + "|area=" + this.area + "|platId=" + this.platId + "|partition=" + this.partition + "|roleId=" + this.roleId + "|roleName=" + this.roleName + "|action=" + this.action + "|sceneInfo=" + this.sceneInfo + "|shareInfo=" + this.shareInfo;
    }
}
