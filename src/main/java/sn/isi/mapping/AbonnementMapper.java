package sn.isi.mapping;

import org.mapstruct.Mapper;
import sn.isi.dto.Abonnement;
import sn.isi.entities.AbonnementEntity;

@Mapper
public interface AbonnementMapper {
    Abonnement toAppRoles(AbonnementEntity abonnement);
    AbonnementEntity fromRole(Abonnement abonnement);
}
