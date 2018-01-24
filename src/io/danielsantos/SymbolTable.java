package io.danielsantos;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, SymbolObject> _table;

    SymbolTable() {
        _table = new HashMap<>();
    }

    void insert(String id, SymbolObject obj) {
        _table.put(id, obj);
    }

    SymbolObject get(String id) {
        return _table.get(id);
    }

    boolean containsObject(String id) {
        return _table.containsKey(id);
    }
}
