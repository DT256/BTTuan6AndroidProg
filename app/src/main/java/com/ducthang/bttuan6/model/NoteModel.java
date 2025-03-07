package com.ducthang.bttuan6.model;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteModel implements Serializable {
    private int IdNote;
    private String NameNote;

}
