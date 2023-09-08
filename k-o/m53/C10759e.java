package m53;

/* renamed from: m53.e */
public enum C10759e {
    present;

    /* renamed from: a */
    public static C10759e m10739a(String str) {
        for (C10759e eVar : values()) {
            if (eVar.toString().equals(str)) {
                return eVar;
            }
        }
        return present;
    }
}
