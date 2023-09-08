package com.tencent.xweb.util;

public abstract class Patch {

    public static class BSpatchHolder {
        public static final Patch INSTANCE = new BSpatch();

        private BSpatchHolder() {
        }
    }

    public static class DummyHolder {
        public static final Patch INSTANCE = new Dpatch();

        private DummyHolder() {
        }
    }

    public static class HpatchHolder {
        public static final Patch INSTANCE = new HPatch();

        private HpatchHolder() {
        }
    }

    public static Patch getInstance(int i) {
        return i == 1 ? BSpatchHolder.INSTANCE : i == 2 ? HpatchHolder.INSTANCE : DummyHolder.INSTANCE;
    }

    public abstract int doPatch(String str, String str2, String str3);
}
