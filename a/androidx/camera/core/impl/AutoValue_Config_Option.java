package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* renamed from: id */
    private final String f44329id;
    private final Object token;
    private final Class<T> valueClass;

    public AutoValue_Config_Option(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f44329id = str;
            if (cls != null) {
                this.valueClass = cls;
                this.token = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.Option)) {
            return false;
        }
        Config.Option option = (Config.Option) obj;
        if (this.f44329id.equals(option.getId()) && this.valueClass.equals(option.getValueClass())) {
            Object obj2 = this.token;
            if (obj2 == null) {
                if (option.getToken() == null) {
                    return true;
                }
            } else if (obj2.equals(option.getToken())) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.f44329id;
    }

    public Object getToken() {
        return this.token;
    }

    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int hashCode = (((this.f44329id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f44329id + ", valueClass=" + this.valueClass + ", token=" + this.token + "}";
    }
}
