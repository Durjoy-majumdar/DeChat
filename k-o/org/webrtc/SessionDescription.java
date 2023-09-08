package org.webrtc;

import java.util.Locale;

public class SessionDescription {
    public final String description;
    public final Type type;

    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public static Type fromCanonicalForm(String str) {
            return (Type) Enum.valueOf(Type.class, str.toUpperCase(Locale.US));
        }

        public String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }
    }

    public SessionDescription(Type type2, String str) {
        this.type = type2;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
