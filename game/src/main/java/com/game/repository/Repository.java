package com.game.repository;

import com.game.entity.Player;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaSpecificationExecutor<Player>, JpaRepository<Player, Long> {
}
